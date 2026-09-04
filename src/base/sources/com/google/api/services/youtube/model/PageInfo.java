package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class PageInfo extends GenericJson {

    @Key
    private Integer resultsPerPage;

    @Key
    private Integer totalResults;

    public Integer getResultsPerPage() {
        return this.resultsPerPage;
    }

    public Integer getTotalResults() {
        return this.totalResults;
    }

    public PageInfo setResultsPerPage(Integer num) {
        this.resultsPerPage = num;
        return this;
    }

    public PageInfo setTotalResults(Integer num) {
        this.totalResults = num;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public PageInfo set(String str, Object obj) {
        return (PageInfo) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public PageInfo clone() {
        return (PageInfo) super.clone();
    }
}
