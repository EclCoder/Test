package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.MediaView;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.je, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3068je {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InMobiNativeImage f26808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f26809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JSONObject f26810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f26811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Float f26812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f26813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaView f26814i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f26815j;

    public C3068je(String str, String str2, InMobiNativeImage iconImage, String str3, JSONObject extras, String str4, Float f10, boolean z10, MediaView mediaView, View view) {
        kotlin.jvm.internal.s.h(iconImage, "iconImage");
        kotlin.jvm.internal.s.h(extras, "extras");
        this.f26806a = str;
        this.f26807b = str2;
        this.f26808c = iconImage;
        this.f26809d = str3;
        this.f26810e = extras;
        this.f26811f = str4;
        this.f26812g = f10;
        this.f26813h = z10;
        this.f26814i = mediaView;
        this.f26815j = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3068je)) {
            return false;
        }
        C3068je c3068je = (C3068je) obj;
        return kotlin.jvm.internal.s.c(this.f26806a, c3068je.f26806a) && kotlin.jvm.internal.s.c(this.f26807b, c3068je.f26807b) && kotlin.jvm.internal.s.c(this.f26808c, c3068je.f26808c) && kotlin.jvm.internal.s.c(this.f26809d, c3068je.f26809d) && kotlin.jvm.internal.s.c(this.f26810e, c3068je.f26810e) && kotlin.jvm.internal.s.c(this.f26811f, c3068je.f26811f) && kotlin.jvm.internal.s.c(this.f26812g, c3068je.f26812g) && this.f26813h == c3068je.f26813h && kotlin.jvm.internal.s.c(this.f26814i, c3068je.f26814i) && kotlin.jvm.internal.s.c(this.f26815j, c3068je.f26815j);
    }

    public final int hashCode() {
        String str = this.f26806a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f26807b;
        int iHashCode2 = (this.f26808c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.f26809d;
        int iHashCode3 = (this.f26810e.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.f26811f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f10 = this.f26812g;
        int iHashCode5 = (Boolean.hashCode(this.f26813h) + ((iHashCode4 + (f10 == null ? 0 : f10.hashCode())) * 31)) * 31;
        MediaView mediaView = this.f26814i;
        int iHashCode6 = (iHashCode5 + (mediaView == null ? 0 : mediaView.hashCode())) * 31;
        View view = this.f26815j;
        return iHashCode6 + (view != null ? view.hashCode() : 0);
    }

    public final String toString() {
        return "NativePubData(title=" + this.f26806a + ", description=" + this.f26807b + ", iconImage=" + this.f26808c + ", ctaText=" + this.f26809d + ", extras=" + this.f26810e + ", sponsored=" + this.f26811f + ", adRating=" + this.f26812g + ", isVideo=" + this.f26813h + ", mediaView=" + this.f26814i + ", adChoiceIcon=" + this.f26815j + ")";
    }
}
