package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class LiveChatPollEditedDetails extends GenericJson {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Key
    private String f21631id;

    @Key
    private List<LiveChatPollItem> items;

    @Key
    private String prompt;

    public String getId() {
        return this.f21631id;
    }

    public List<LiveChatPollItem> getItems() {
        return this.items;
    }

    public String getPrompt() {
        return this.prompt;
    }

    public LiveChatPollEditedDetails setId(String str) {
        this.f21631id = str;
        return this;
    }

    public LiveChatPollEditedDetails setItems(List<LiveChatPollItem> list) {
        this.items = list;
        return this;
    }

    public LiveChatPollEditedDetails setPrompt(String str) {
        this.prompt = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LiveChatPollEditedDetails set(String str, Object obj) {
        return (LiveChatPollEditedDetails) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LiveChatPollEditedDetails clone() {
        return (LiveChatPollEditedDetails) super.clone();
    }
}
