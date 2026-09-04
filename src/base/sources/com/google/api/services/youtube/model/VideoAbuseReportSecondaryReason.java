package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoAbuseReportSecondaryReason extends GenericJson {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Key
    private String f21644id;

    @Key
    private String label;

    public String getId() {
        return this.f21644id;
    }

    public String getLabel() {
        return this.label;
    }

    public VideoAbuseReportSecondaryReason setId(String str) {
        this.f21644id = str;
        return this;
    }

    public VideoAbuseReportSecondaryReason setLabel(String str) {
        this.label = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VideoAbuseReportSecondaryReason set(String str, Object obj) {
        return (VideoAbuseReportSecondaryReason) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VideoAbuseReportSecondaryReason clone() {
        return (VideoAbuseReportSecondaryReason) super.clone();
    }
}
