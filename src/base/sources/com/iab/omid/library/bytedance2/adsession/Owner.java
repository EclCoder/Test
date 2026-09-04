package com.iab.omid.library.bytedance2.adsession;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;

/* JADX INFO: loaded from: classes6.dex */
public enum Owner {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE(DevicePublicKeyStringDef.NONE);

    private final String owner;

    Owner(String str) {
        this.owner = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.owner;
    }
}
