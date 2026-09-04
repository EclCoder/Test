package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ex, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1248Ex {
    public static String[] A05 = {"LpJTwMN2G", "VgMO4aUKUhad1vQS8qeWccWG6TZwybQB", "ACcLkDhyx", "Vz4L8Yk2qa8xi00BpA99exXw347yn2OW", "M93qmyVYUpuFuHp", "Ixo", "WCFkueysi57ip8GEP7BFiSRGMX4T5ofH", "LFY6A3GYQmBEHARGrOHSwwc2jPi1aXj0"};
    public final int A00;
    public final C2713pY A01;
    public final Object A02;
    public final C10807s[] A03;
    public final InterfaceC2570nE[] A04;

    public C1248Ex(C10807s[] c10807sArr, InterfaceC2570nE[] interfaceC2570nEArr, C2713pY c2713pY, Object obj) {
        this.A03 = c10807sArr;
        this.A04 = (InterfaceC2570nE[]) interfaceC2570nEArr.clone();
        this.A01 = c2713pY;
        this.A02 = obj;
        this.A00 = c10807sArr.length;
    }

    public final boolean A00(int i10) {
        return this.A03[i10] != null;
    }

    public final boolean A01(C1248Ex c1248Ex, int i10) {
        if (c1248Ex == null) {
            return false;
        }
        C10807s[] c10807sArr = this.A03;
        if (A05[5].length() == 3) {
            A05[1] = "2a41zxf8OUQisEdMYeAN8aC4JNcLEgEy";
            if (!C5C.A1E(c10807sArr[i10], c1248Ex.A03[i10])) {
                return false;
            }
            InterfaceC2570nE interfaceC2570nE = this.A04[i10];
            InterfaceC2570nE interfaceC2570nE2 = c1248Ex.A04[i10];
            String[] strArr = A05;
            if (strArr[2].length() == strArr[0].length()) {
                A05[4] = "ShAZgc6gkhlm9OR";
                return C5C.A1E(interfaceC2570nE, interfaceC2570nE2);
            }
        }
        throw new RuntimeException();
    }
}
