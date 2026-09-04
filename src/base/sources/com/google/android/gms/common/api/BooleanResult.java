package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class BooleanResult implements Result {
    private final Status zaa;
    private final boolean zab;

    public BooleanResult(Status status, boolean z10) {
        this.zaa = (Status) Preconditions.checkNotNull(status, "Status must not be null");
        this.zab = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BooleanResult)) {
            return false;
        }
        BooleanResult booleanResult = (BooleanResult) obj;
        return this.zaa.equals(booleanResult.zaa) && this.zab == booleanResult.zab;
    }

    @Override // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.zaa;
    }

    public boolean getValue() {
        return this.zab;
    }

    public final int hashCode() {
        return ((this.zaa.hashCode() + 527) * 31) + (this.zab ? 1 : 0);
    }
}
