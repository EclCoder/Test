package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class Nonprofit extends GenericJson {

    @Key
    private NonprofitId nonprofitId;

    @Key
    private String nonprofitLegalName;

    public NonprofitId getNonprofitId() {
        return this.nonprofitId;
    }

    public String getNonprofitLegalName() {
        return this.nonprofitLegalName;
    }

    public Nonprofit setNonprofitId(NonprofitId nonprofitId) {
        this.nonprofitId = nonprofitId;
        return this;
    }

    public Nonprofit setNonprofitLegalName(String str) {
        this.nonprofitLegalName = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public Nonprofit set(String str, Object obj) {
        return (Nonprofit) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public Nonprofit clone() {
        return (Nonprofit) super.clone();
    }
}
