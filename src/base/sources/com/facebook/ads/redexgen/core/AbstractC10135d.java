package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC10135d {
    public static void A00(InterfaceC2694pF interfaceC2694pF) {
        if (interfaceC2694pF != null) {
            try {
                interfaceC2694pF.close();
            } catch (IOException unused) {
            }
        }
    }
}
