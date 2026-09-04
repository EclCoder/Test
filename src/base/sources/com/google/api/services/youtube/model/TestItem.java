package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class TestItem extends GenericJson {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Key
    private String f21641id;

    @Key
    private TestItemTestItemSnippet snippet;

    public String getId() {
        return this.f21641id;
    }

    public TestItemTestItemSnippet getSnippet() {
        return this.snippet;
    }

    public TestItem setId(String str) {
        this.f21641id = str;
        return this;
    }

    public TestItem setSnippet(TestItemTestItemSnippet testItemTestItemSnippet) {
        this.snippet = testItemTestItemSnippet;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public TestItem set(String str, Object obj) {
        return (TestItem) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public TestItem clone() {
        return (TestItem) super.clone();
    }
}
