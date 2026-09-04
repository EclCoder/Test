package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Data;
import com.google.api.client.util.Key;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class LiveChatPollOpenedDetails extends GenericJson {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Key
    private String f21632id;

    @Key
    private List<LiveChatPollItem> items;

    @Key
    private String prompt;

    static {
        Data.nullOf(LiveChatPollItem.class);
    }

    public String getId() {
        return this.f21632id;
    }

    public List<LiveChatPollItem> getItems() {
        return this.items;
    }

    public String getPrompt() {
        return this.prompt;
    }

    public LiveChatPollOpenedDetails setId(String str) {
        this.f21632id = str;
        return this;
    }

    public LiveChatPollOpenedDetails setItems(List<LiveChatPollItem> list) {
        this.items = list;
        return this;
    }

    public LiveChatPollOpenedDetails setPrompt(String str) {
        this.prompt = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LiveChatPollOpenedDetails set(String str, Object obj) {
        return (LiveChatPollOpenedDetails) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LiveChatPollOpenedDetails clone() {
        return (LiveChatPollOpenedDetails) super.clone();
    }
}
