package com.aispace.erksystem.rmq.module.handler.api;

import com.aispace.erksystem.rmq.module.handler.base.RmqIncomingHandler;
import com.erksystem.protobuf.api.*;

import static com.aispace.erksystem.rmq.module.handler.base.RmqOutgoingHandler.sendToApi;

/**
 * Created by Ai_Space
 */
public class EmoRecogDeleteRqHandler extends RmqIncomingHandler<EmoRecogDeleteRQ> {
    /*
    message EmoRecogDeleteRQ{
      ErkMsgHeader ErkMsgHead = 1;
      int64 MsgTime = 2;
      ServiceType_e ServiceType = 3;
    }

    message EmoRecogDeleteRP{
      ErkMsgHeader ErkMsgHead = 1;
      int64 MsgTime = 2;
      ReturnCode_e ReturnCode = 3;
      ErkEngineInfo_s PhysioEngineInfo = 4;
      ErkEngineInfo_s SpeechEngineInfo = 5;
      ErkEngineInfo_s FaceEngineInfo = 6;
      ErkEngineInfo_s Reserved1EngineInfo = 7;
      ErkEngineInfo_s Reserved2EngineInfo = 8;
    }
     */
    @Override
    protected void handle() {
        throw new IllegalStateException("FAIL");
        // TODO 개발 필요
    }

    @Override
    protected void onFail() {
        EmoRecogDeleteRP res = EmoRecogDeleteRP.newBuilder()
                .setErkMsgHead(ErkMsgHeader.newBuilder(msg.getErkMsgHead()).setMsgType(ErkMsgType_e.emoRecogDeleteRp))
                .setMsgTime(System.currentTimeMillis())
                // .setReturnCode() // TODO
                .build();

        sendToApi(res);
    }
}