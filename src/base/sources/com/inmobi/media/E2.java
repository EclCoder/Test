package com.inmobi.media;

import android.util.Base64;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class E2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BitSet f24690a;

    public final void a(String b64String) {
        byte[] value;
        BitSet bitSetValueOf;
        kotlin.jvm.internal.s.h(b64String, "b64String");
        try {
            value = Base64.decode(b64String, 0);
        } catch (Exception e10) {
            fl.k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
            value = null;
        }
        if (value != null) {
            kotlin.jvm.internal.s.h(value, "value");
            B5.f24500a.getClass();
            if (B5.w()) {
                bitSetValueOf = BitSet.valueOf(value);
            } else {
                kotlin.jvm.internal.s.h(value, "<this>");
                BitSet bitSet = new BitSet(value.length * 8);
                int i10 = 0;
                for (byte b10 : value) {
                    int i11 = 0;
                    while (i11 < 8) {
                        boolean z10 = true;
                        int i12 = i10 + 1;
                        if (((b10 >> ((byte) i11)) & 1) != 1) {
                            z10 = false;
                        }
                        bitSet.set(i10, z10);
                        i11++;
                        i10 = i12;
                    }
                }
                bitSetValueOf = bitSet;
            }
            this.f24690a = bitSetValueOf;
        }
    }
}
