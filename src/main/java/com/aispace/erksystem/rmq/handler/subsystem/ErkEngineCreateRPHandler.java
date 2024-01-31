package com.aispace.erksystem.rmq.handler.subsystem;

import com.aispace.erksystem.rmq.handler.base.RmqIncomingHandler;
import com.erksystem.protobuf.api.ErkEngineCreateRP_m;
import com.erksystem.protobuf.api.ErkInterMsgHead_s;
import lombok.extern.slf4j.Slf4j;

import static com.erksystem.protobuf.api.ReturnCode_e.ReturnCode_ok;

/**
 * Created by Ai_Space
 */
@Slf4j
public class ErkEngineCreateRPHandler extends RmqIncomingHandler<ErkEngineCreateRP_m> {
    @Override
    protected void handle() {
        ErkInterMsgHead_s erkMsgHead = msg.getErkInterMsgHead();
        String key = erkMsgHead.getMsgType().toString() + erkMsgHead.getUserId() + erkMsgHead.getOrgId();

        promiseManager.findPromiseInfo(key).ifPresentOrElse(promiseInfo -> {
            if (msg.getReturnCode() == ReturnCode_ok) {
                promiseInfo.procSuccess();
            } else {
                log.warn("[{}] ErkEngineCreate Fail by [{}]", key, msg.getReturnCode());
                promiseInfo.procFail();
            }
        }, () -> log.warn("[{}] Can not find PromiseInfo", key));
    }

    @Override
    protected void onFail(int reasonCode, String reason) {
        // Do Nothing
    }
}
