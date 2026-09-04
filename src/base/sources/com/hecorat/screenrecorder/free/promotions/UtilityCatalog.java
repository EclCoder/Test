package com.hecorat.screenrecorder.free.promotions;

import com.squareup.moshi.g;
import gl.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@g(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/hecorat/screenrecorder/free/promotions/UtilityCatalog;", "", "version", "", "items", "", "Lcom/hecorat/screenrecorder/free/promotions/UtilityCatalogEntry;", "<init>", "(ILjava/util/List;)V", "getVersion", "()I", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UtilityCatalog {
    private final List<UtilityCatalogEntry> items;
    private final int version;

    /* JADX WARN: Multi-variable type inference failed */
    public UtilityCatalog() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UtilityCatalog copy$default(UtilityCatalog utilityCatalog, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = utilityCatalog.version;
        }
        if ((i11 & 2) != 0) {
            list = utilityCatalog.items;
        }
        return utilityCatalog.copy(i10, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public final List<UtilityCatalogEntry> component2() {
        return this.items;
    }

    public final UtilityCatalog copy(int version, List<UtilityCatalogEntry> items) {
        s.h(items, "items");
        return new UtilityCatalog(version, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UtilityCatalog)) {
            return false;
        }
        UtilityCatalog utilityCatalog = (UtilityCatalog) other;
        return this.version == utilityCatalog.version && s.c(this.items, utilityCatalog.items);
    }

    public final List<UtilityCatalogEntry> getItems() {
        return this.items;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (Integer.hashCode(this.version) * 31) + this.items.hashCode();
    }

    public String toString() {
        return "UtilityCatalog(version=" + this.version + ", items=" + this.items + ')';
    }

    public UtilityCatalog(int i10, List<UtilityCatalogEntry> items) {
        s.h(items, "items");
        this.version = i10;
        this.items = items;
    }

    public /* synthetic */ UtilityCatalog(int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? r.l() : list);
    }
}
