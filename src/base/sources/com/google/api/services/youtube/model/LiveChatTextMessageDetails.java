package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class LiveChatTextMessageDetails extends GenericJson {

    @Key
    private String messageText;

    public String getMessageText() {
        return this.messageText;
    }

    public LiveChatTextMessageDetails setMessageText(String str) {
        this.messageText = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LiveChatTextMessageDetails set(String str, Object obj) {
        return (LiveChatTextMessageDetails) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LiveChatTextMessageDetails clone() {
        return (LiveChatTextMessageDetails) super.clone();
    }
}
