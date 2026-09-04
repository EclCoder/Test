package com.vungle.ads.internal.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class i {
    private final String description;
    private final boolean errorIsTerminal;
    private final boolean isRetryCode;

    public i(String description, boolean z10, boolean z11) {
        s.h(description, "description");
        this.description = description;
        this.errorIsTerminal = z10;
        this.isRetryCode = z11;
    }

    public static /* synthetic */ i copy$default(i iVar, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = iVar.description;
        }
        if ((i10 & 2) != 0) {
            z10 = iVar.errorIsTerminal;
        }
        if ((i10 & 4) != 0) {
            z11 = iVar.isRetryCode;
        }
        return iVar.copy(str, z10, z11);
    }

    public final String component1() {
        return this.description;
    }

    public final boolean component2() {
        return this.errorIsTerminal;
    }

    public final boolean component3() {
        return this.isRetryCode;
    }

    public final i copy(String description, boolean z10, boolean z11) {
        s.h(description, "description");
        return new i(description, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.c(this.description, iVar.description) && this.errorIsTerminal == iVar.errorIsTerminal && this.isRetryCode == iVar.isRetryCode;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getErrorIsTerminal() {
        return this.errorIsTerminal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.description.hashCode() * 31;
        boolean z10 = this.errorIsTerminal;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode + r10) * 31;
        boolean z11 = this.isRetryCode;
        return i10 + (z11 ? 1 : z11);
    }

    public final boolean isRetryCode() {
        return this.isRetryCode;
    }

    public String toString() {
        return "ErrorInfo(description=" + this.description + ", errorIsTerminal=" + this.errorIsTerminal + ", isRetryCode=" + this.isRetryCode + ')';
    }

    public /* synthetic */ i(String str, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11);
    }
}
