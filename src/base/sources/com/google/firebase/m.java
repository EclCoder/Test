package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f22215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f22216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f22217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f22218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f22219g;

    private m(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f22214b = str;
        this.f22213a = str2;
        this.f22215c = str3;
        this.f22216d = str4;
        this.f22217e = str5;
        this.f22218f = str6;
        this.f22219g = str7;
    }

    public static m a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new m(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public String b() {
        return this.f22213a;
    }

    public String c() {
        return this.f22214b;
    }

    public String d() {
        return this.f22217e;
    }

    public String e() {
        return this.f22219g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Objects.equal(this.f22214b, mVar.f22214b) && Objects.equal(this.f22213a, mVar.f22213a) && Objects.equal(this.f22215c, mVar.f22215c) && Objects.equal(this.f22216d, mVar.f22216d) && Objects.equal(this.f22217e, mVar.f22217e) && Objects.equal(this.f22218f, mVar.f22218f) && Objects.equal(this.f22219g, mVar.f22219g);
    }

    public int hashCode() {
        return Objects.hashCode(this.f22214b, this.f22213a, this.f22215c, this.f22216d, this.f22217e, this.f22218f, this.f22219g);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f22214b).add("apiKey", this.f22213a).add("databaseUrl", this.f22215c).add("gcmSenderId", this.f22217e).add("storageBucket", this.f22218f).add("projectId", this.f22219g).toString();
    }
}
