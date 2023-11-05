package com.aispace.erksystem.rmq.module.handler.api;

import com.aispace.erksystem.rmq.module.handler.base.RmqIncomingHandler;
import com.erksystem.protobuf.api.ErkMsgDataHeader;
import com.erksystem.protobuf.api.PhysioEmoRecogRP;
import com.erksystem.protobuf.api.SpeechEmoRecogRP;
import com.erksystem.protobuf.api.SpeechEmoRecogRQ;

import static com.aispace.erksystem.rmq.module.handler.base.RmqOutgoingHandler.sendToApi;

/**
 * Created by Ai_Space
 */
public class SpeechEmoRecogRqHandler extends RmqIncomingHandler<SpeechEmoRecogRQ> {
    /*
    message SpeechEmoRecogRQ{
      ErkMsgDataHeader ErkMsgDataHead = 1;
      int64 DataTimeStamp = 2;
      int32 MsgDataLength = 3;
      bytes MsgDataFrame = 4;
    }

    message SpeechEmoRecogRP{
      ErkMsgDataHeader ErkMsgDataHead = 1;
      ReturnCode_e ReturnCode = 2;
      int64 EmoRecogTime = 3;
      EmotionType_e Emotion = 4;
      float Accuracy = 5;
    }
     */
    @Override
    protected void handle() {
        throw new IllegalStateException("FAIL");
        // TODO 개발 필요
    }

    @Override
    protected void onFail() {
        SpeechEmoRecogRP res = SpeechEmoRecogRP.newBuilder()
                .setErkMsgDataHead(ErkMsgDataHeader.newBuilder(msg.getErkMsgDataHead()))
                // .setReturnCode() // TODO
                .build();

        sendToApi(res);
    }
}