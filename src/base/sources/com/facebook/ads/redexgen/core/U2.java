package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.dynamicloading.FlashPreferences;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class U2 {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static String[] A03 = {"i0FOsf0o9fpBvAlaEaGgnCYFRbNnwBKJ", "ZsBa2nEfyhltTo", "ZG6g5nWnUhxh", "6zjosiDwJWE47kuMvKAUCDrCWUeR8P3q", "Gh89HIHHDqfPtiuASbXLVil627eRz", "Lsbp3nhJR34oAmuvtJAouWbaxC4Ny9OM", "s0Y", "C"};
    public static final AtomicBoolean A04;
    public static final AtomicBoolean A05;
    public static final AtomicBoolean A06;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 33);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-89, -39, -39, -89, -39, -88, -40, -84, -54, -58, -59, -7, -24, -19, -23, -14, -25, -23, -46, -23, -8, -5, -13, -10, -17, -88, -103, -96, 117, -66, -61, -66, -55, -66, -74, -63, -66, -49, -74, -55, -66, -60, -61, 117, -56, -55, -74, -57, -55, -70, -71, -84, -67, -60, 121, -48, -70, -52, 121, -70, -59, -53, -66, -70, -67, -46, 121, -62, -57, -62, -51, -62, -70, -59, -62, -45, -66, -67, 122, 121, -84, -60, -62, -55, -55, -62, -57, -64, -121, -90, -68, -62, 109, -79, -68, -69, 116, -63, 109, -80, -82, -71, -71, 109, -114, -62, -79, -74, -78, -69, -80, -78, -101, -78, -63, -60, -68, -65, -72, -114, -79, -64, 123, -74, -69, -74, -63, -74, -82, -71, -74, -57, -78, 117, 118, 123, 109, -96, -68, -70, -78, 109, -77, -62, -69, -80, -63, -74, -68, -69, -82, -71, -74, -63, -58, 109, -70, -82, -58, 109, -69, -68, -63, 109, -60, -68, -65, -72, 109, -67, -65, -68, -67, -78, -65, -71, -58, 123, -120, -105, -112, -58, -52, -63, -45, -56, 0, 6, -5, 13, 2, -7, -3, 9, 8, 0, 3, 1, -42, -44, -35, -44, -31, -40, -46, -3, 2, -3, 8, -3, -11, 0, -3, 14, -7, -51, -46, -51, -40, -51, -59, -48, -51, -34, -55, -116, -115, -124, -46, -45, -40, -124, -57, -59, -48, -48, -55, -56, -110, 1, -10, 8, 9, -12, 7, -6, 8, 10, 1, 9};
    }

    static {
        A03();
        A06 = new AtomicBoolean();
        A04 = new AtomicBoolean();
        A05 = new AtomicBoolean();
    }

    public static C2042eB A00() {
        return new C2042eB();
    }

    public static C2041eA A01(C2194ge c2194ge) {
        return new C2041eA(c2194ge);
    }

    public static void A04(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        Y4.A01.execute(new C2043eC(initListener, initResult));
    }

    public static void A06(C2194ge c2194ge) {
        if (AbstractC1650Ur.A0P(c2194ge) && !A05.getAndSet(true)) {
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = new TT(Thread.getDefaultUncaughtExceptionHandler(), c2194ge, new C1976d6());
                Thread.setDefaultUncaughtExceptionHandler(defaultUncaughtExceptionHandler);
            } catch (Exception e10) {
                c2194ge.A08().ABC(A02(198, 7, 78), AbstractC1610Td.A1X, new C1611Te(e10));
            }
        }
    }

    public static void A07(C2194ge c2194ge) {
        A0H(c2194ge, null, null, 3);
    }

    public static void A08(C2194ge c2194ge) {
        A0H(c2194ge, null, null, 3);
    }

    public static void A09(C2194ge c2194ge) {
        if (C1648Up.A2O(c2194ge)) {
            A0F(c2194ge, 0);
        }
        if (C1648Up.A2X(c2194ge)) {
            A0B(c2194ge);
        }
    }

    public static void A0A(C2194ge c2194ge) {
        if (C1648Up.A2P(c2194ge)) {
            String[] strArr = A03;
            if (strArr[1].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "XjvPwbQrSqkAxC";
            strArr2[6] = "skO";
            A0G(c2194ge, null, 3);
        }
    }

    public static void A0B(C2194ge c2194ge) {
        YG.A06.execute(new C2044eD(c2194ge));
    }

    public static void A0C(C2194ge c2194ge) {
        OP.A02(c2194ge);
        TX.A0C(c2194ge, new C1946cc(c2194ge), new C2094f2(), BuildConfigApi.isDebug());
        c2194ge.A0A();
        A0D(c2194ge);
    }

    public static void A0D(C2194ge c2194ge) {
        if (ProcessUtils.isRemoteRenderingProcess()) {
            return;
        }
        SharedPreferences sharedPreferences = FlashPreferences.getSharedPreferences(c2194ge);
        String string = sharedPreferences.getString(A02(186, 12, Sdk$SDKError.b.TPAT_ERROR_VALUE), null);
        String string2 = sharedPreferences.getString(A02(239, 11, Sdk$SDKError.b.GZIP_ENCODE_ERROR_VALUE), null);
        if (string != null && string2 != null) {
            InterfaceC1609Tc interfaceC1609TcA08 = c2194ge.A08();
            C1611Te c1611Te = new C1611Te(string2);
            String flashConfig = A02(181, 5, 63);
            interfaceC1609TcA08.ABz(flashConfig, 3701, c1611Te);
        }
    }

    public static void A0F(C2194ge c2194ge, int i10) {
        T7.A01(c2194ge);
        if (A04.getAndSet(true)) {
            return;
        }
        if (AdInternalSettings.isDebugBuild() || AdInternalSettings.isDebuggerOn()) {
            AbstractC1681Vy.A02();
        }
        A06(c2194ge);
        AbstractC1688Wf.A00(C1648Up.A0q(c2194ge), BuildConfigApi.isDebug(), A00(), A01(c2194ge));
        C1589Si.A03(C1648Up.A04(c2194ge));
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            C2167gD.A09(new C2032e1(c2194ge));
        }
        if (i10 == 3) {
            Log.e(A02(8, 17, 99), A02(89, 89, 44));
            c2194ge.A08().ABz(A02(178, 3, 6), AbstractC1610Td.A0R, new C1611Te(A02(Sdk$SDKError.b.AD_RESPONSE_EMPTY_VALUE, 24, 67)));
        }
        ActivityUtils.A04(c2194ge, AudienceNetworkActivity.class);
        YG.A05(c2194ge);
        VL.A05(c2194ge);
        N8.A01(c2194ge);
        if (C1648Up.A16(c2194ge)) {
            RX.A00(c2194ge);
        }
        if (C1648Up.A1z(c2194ge)) {
            ZR.A02().A90(c2194ge);
        }
    }

    public static void A0G(C2194ge c2194ge, AudienceNetworkAds.InitListener initListener, int i10) {
        T7.A01(c2194ge);
        boolean z10 = false;
        synchronized (U2.class) {
            boolean execute = A00;
            if (!execute) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 == 3) {
                        boolean execute2 = A01;
                        if (!execute2) {
                            A01 = true;
                            z10 = true;
                        }
                    }
                } else {
                    A00 = true;
                    z10 = true;
                }
            }
        }
        if (z10) {
            A0F(c2194ge, i10);
            YG.A08.execute(new C2069ed(c2194ge, initListener));
        } else {
            if (i10 != 1) {
                return;
            }
            String strA02 = A02(51, 38, 56);
            if (initListener != null) {
                A04(initListener, new U1(true, strA02));
            } else {
                Log.w(A02(8, 17, 99), strA02);
            }
        }
    }

    public static void A0H(C2194ge c2194ge, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, int i10) {
        AbstractC1681Vy.A05(A02(Sdk$SDKError.b.AD_IS_PLAYING_VALUE, 10, Sdk$SDKError.b.INVALID_INDEX_URL_VALUE), A02(25, 26, 52), A02(0, 8, 82));
        C2167gD.A06();
        A0G(c2194ge, initListener, i10);
    }

    public static synchronized boolean A0I() {
        return A00;
    }
}
