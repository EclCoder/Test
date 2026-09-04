package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2530mZ implements InterfaceC1324Hw {
    public static String[] A00 = {"S2ZlE7yw63A48uwr9dQcAEYhUnBJ4Yn0", "jzjCSZ", "gN1GhDNq1ONaTY", "QUbV6eP7CXYOE5n4wRXfJJIvrecH4qk8", "luywBeNRakBazgpsmb", "EdZTTUAmlRsHtXkkAmykmZcXBm9Gnzxa", "aBS20hcvH8Cg0VDZoQaxMtYiCLoGsxgc", "2I8VYTEH9eD6qwDjwvQqiLyn0yln2Tpt"};

    public abstract Metadata A0R(C11129e c11129e, ByteBuffer byteBuffer);

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1324Hw
    public final Metadata A5o(C11129e c11129e) {
        boolean z10;
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC09823y.A01(c11129e.A02);
        if (byteBuffer.position() == 0 && byteBuffer.hasArray()) {
            int iArrayOffset = byteBuffer.arrayOffset();
            String[] strArr = A00;
            if (strArr[7].charAt(18) == strArr[3].charAt(18)) {
                throw new RuntimeException();
            }
            A00[1] = "EqsX6PhC";
            if (iArrayOffset == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        AbstractC09823y.A07(z10);
        if (c11129e.A04()) {
            return null;
        }
        return A0R(c11129e, byteBuffer);
    }
}
