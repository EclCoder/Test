package com.hecorat.screenrecorder.free.promotions;

import bm.r;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.squareup.moshi.e;
import com.squareup.moshi.g;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@g(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001c\u001a\u00020\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J{\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u0006,"}, d2 = {"Lcom/hecorat/screenrecorder/free/promotions/UtilityCatalogEntry;", "", "id", "", "enabled", "", "isNew", TtmlNode.ATTR_TTS_COLOR, "packageName", "publisher", CampaignEx.JSON_KEY_TITLE, "", "iconUrl", "bgTint", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getEnabled", "()Z", "getColor", "getPackageName", "getPublisher", "getTitle", "()Ljava/util/Map;", "getIconUrl", "getBgTint", "titleFor", "languageTag", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UtilityCatalogEntry {
    private final String bgTint;
    private final String color;
    private final boolean enabled;
    private final String iconUrl;
    private final String id;
    private final boolean isNew;
    private final String packageName;
    private final String publisher;
    private final Map<String, String> title;

    public UtilityCatalogEntry(String id2, boolean z10, @e(name = "is_new") boolean z11, String str, @e(name = "package") String str2, String str3, Map<String, String> map, @e(name = CampaignEx.JSON_KEY_ICON_URL) String str4, @e(name = "bg_tint") String str5) {
        s.h(id2, "id");
        this.id = id2;
        this.enabled = z10;
        this.isNew = z11;
        this.color = str;
        this.packageName = str2;
        this.publisher = str3;
        this.title = map;
        this.iconUrl = str4;
        this.bgTint = str5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UtilityCatalogEntry copy$default(UtilityCatalogEntry utilityCatalogEntry, String str, boolean z10, boolean z11, String str2, String str3, String str4, Map map, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = utilityCatalogEntry.id;
        }
        if ((i10 & 2) != 0) {
            z10 = utilityCatalogEntry.enabled;
        }
        if ((i10 & 4) != 0) {
            z11 = utilityCatalogEntry.isNew;
        }
        if ((i10 & 8) != 0) {
            str2 = utilityCatalogEntry.color;
        }
        if ((i10 & 16) != 0) {
            str3 = utilityCatalogEntry.packageName;
        }
        if ((i10 & 32) != 0) {
            str4 = utilityCatalogEntry.publisher;
        }
        if ((i10 & 64) != 0) {
            map = utilityCatalogEntry.title;
        }
        if ((i10 & 128) != 0) {
            str5 = utilityCatalogEntry.iconUrl;
        }
        if ((i10 & 256) != 0) {
            str6 = utilityCatalogEntry.bgTint;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        Map map2 = map;
        String str10 = str3;
        boolean z12 = z11;
        return utilityCatalogEntry.copy(str, z10, z12, str2, str10, str9, map2, str7, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsNew() {
        return this.isNew;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPublisher() {
        return this.publisher;
    }

    public final Map<String, String> component7() {
        return this.title;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBgTint() {
        return this.bgTint;
    }

    public final UtilityCatalogEntry copy(String id2, boolean enabled, @e(name = "is_new") boolean isNew, String color, @e(name = "package") String packageName, String publisher, Map<String, String> title, @e(name = CampaignEx.JSON_KEY_ICON_URL) String iconUrl, @e(name = "bg_tint") String bgTint) {
        s.h(id2, "id");
        return new UtilityCatalogEntry(id2, enabled, isNew, color, packageName, publisher, title, iconUrl, bgTint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UtilityCatalogEntry)) {
            return false;
        }
        UtilityCatalogEntry utilityCatalogEntry = (UtilityCatalogEntry) other;
        return s.c(this.id, utilityCatalogEntry.id) && this.enabled == utilityCatalogEntry.enabled && this.isNew == utilityCatalogEntry.isNew && s.c(this.color, utilityCatalogEntry.color) && s.c(this.packageName, utilityCatalogEntry.packageName) && s.c(this.publisher, utilityCatalogEntry.publisher) && s.c(this.title, utilityCatalogEntry.title) && s.c(this.iconUrl, utilityCatalogEntry.iconUrl) && s.c(this.bgTint, utilityCatalogEntry.bgTint);
    }

    public final String getBgTint() {
        return this.bgTint;
    }

    public final String getColor() {
        return this.color;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getPublisher() {
        return this.publisher;
    }

    public final Map<String, String> getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.isNew)) * 31;
        String str = this.color;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.packageName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.publisher;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.title;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        String str4 = this.iconUrl;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bgTint;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean isNew() {
        return this.isNew;
    }

    public final String titleFor(String languageTag) {
        s.h(languageTag, "languageTag");
        Map<String, String> map = this.title;
        if (map == null) {
            return null;
        }
        String str = map.get(languageTag);
        if (str != null) {
            return str;
        }
        String str2 = map.get(r.R0(languageTag, '-', null, 2, null));
        if (str2 != null) {
            return str2;
        }
        String str3 = map.get("en");
        return str3 == null ? (String) gl.r.c0(map.values()) : str3;
    }

    public String toString() {
        return "UtilityCatalogEntry(id=" + this.id + ", enabled=" + this.enabled + ", isNew=" + this.isNew + ", color=" + this.color + ", packageName=" + this.packageName + ", publisher=" + this.publisher + ", title=" + this.title + ", iconUrl=" + this.iconUrl + ", bgTint=" + this.bgTint + ')';
    }

    public /* synthetic */ UtilityCatalogEntry(String str, boolean z10, boolean z11, String str2, String str3, String str4, Map map, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : map, (i10 & 128) != 0 ? null : str5, (i10 & 256) != 0 ? null : str6);
    }
}
