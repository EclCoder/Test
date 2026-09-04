package com.inmobi.media;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import java.util.Objects;

/* JADX INFO: renamed from: com.inmobi.media.mj, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3151mj implements AppLovinCommunicatorSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tl.o f27007a;

    public C3151mj(tl.o oVar) {
        this.f27007a = oVar;
    }

    public final String getCommunicatorId() {
        return "AdInfoInterceptor";
    }

    public final void onMessageReceived(AppLovinCommunicatorMessage message) {
        kotlin.jvm.internal.s.h(message, "message");
        Uri data = message.getData();
        message.getTopic();
        Objects.toString(data);
        tl.o oVar = this.f27007a;
        Bundle messageData = message.getMessageData();
        String topic = message.getTopic();
        kotlin.jvm.internal.s.g(topic, "getTopic(...)");
        oVar.invoke(messageData, topic);
    }
}
