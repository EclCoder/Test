package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.f1;
import androidx.media3.exoplayer.g2;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.j;
import androidx.media3.exoplayer.mediacodec.l;
import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.facebook.ads.AdError;
import com.google.android.gms.common.Scopes;
import com.googlecode.mp4parser.boxes.microsoft.XtraBox;
import com.googlecode.mp4parser.boxes.microsoft.lIu.trPLwhKZgZ;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.CrashConfig;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.List;
import m2.r;
import t1.g0;
import t1.o;
import tn.xQIL.Saucuwx;
import w1.a0;
import w1.c0;
import w1.n;
import w1.q;
import w1.v;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class f extends MediaCodecRenderer implements g.b {

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private static final int[] f6172o1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static boolean f6173p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private static boolean f6174q1;
    private final Context H0;
    private final r I0;
    private final boolean J0;
    private final i.a K0;
    private final int L0;
    private final boolean M0;
    private final g N0;
    private final g.a O0;
    private c P0;
    private boolean Q0;
    private boolean R0;
    private VideoSink S0;
    private boolean T0;
    private List U0;
    private Surface V0;
    private m2.e W0;
    private v X0;
    private boolean Y0;
    private int Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private long f6175a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private int f6176b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private int f6177c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private int f6178d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private long f6179e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private int f6180f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private long f6181g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private g0 f6182h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private g0 f6183i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private int f6184j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private boolean f6185k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private int f6186l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    d f6187m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private m2.f f6188n1;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static final class b {
        public static boolean a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null && display.isHdr()) {
                for (int i10 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                    if (i10 == 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    protected static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6192c;

        public c(int i10, int i11, int i12) {
            this.f6190a = i10;
            this.f6191b = i11;
            this.f6192c = i12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private final class d implements androidx.media3.exoplayer.mediacodec.h.d, Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f6193a;

        public d(androidx.media3.exoplayer.mediacodec.h hVar) {
            Handler handlerA = c0.A(this);
            this.f6193a = handlerA;
            hVar.n(this, handlerA);
        }

        private void b(long j10) {
            f fVar = f.this;
            if (this != fVar.f6187m1 || fVar.x0() == null) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                f.this.o2();
                return;
            }
            try {
                f.this.n2(j10);
            } catch (ExoPlaybackException e10) {
                f.this.x1(e10);
            }
        }

        @Override // androidx.media3.exoplayer.mediacodec.h.d
        public void a(androidx.media3.exoplayer.mediacodec.h hVar, long j10, long j11) {
            if (c0.f55769a >= 30) {
                b(j10);
            } else {
                this.f6193a.sendMessageAtFrontOfQueue(Message.obtain(this.f6193a, 0, (int) (j10 >> 32), (int) j10));
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(c0.Z0(message.arg1, message.arg2));
            return true;
        }
    }

    public f(Context context, androidx.media3.exoplayer.mediacodec.h.b bVar, l lVar, long j10, boolean z10, Handler handler, i iVar, int i10) {
        this(context, bVar, lVar, j10, z10, handler, iVar, i10, 30.0f);
    }

    private boolean C2(j jVar) {
        if (c0.f55769a < 23 || this.f6185k1 || O1(jVar.f5617a)) {
            return false;
        }
        return !jVar.f5623g || m2.e.b(this.H0);
    }

    private void E2() {
        androidx.media3.exoplayer.mediacodec.h hVarX0 = x0();
        if (hVarX0 != null && c0.f55769a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f6184j1));
            hVarX0.b(bundle);
        }
    }

    private static boolean N1() {
        return c0.f55769a >= 21;
    }

    private static boolean Q1() {
        return "NVIDIA".equals(c0.f55771c);
    }

    private static boolean S1() {
        int i10 = c0.f55769a;
        byte b10 = 7;
        if (i10 <= 28) {
            String str = c0.f55770b;
            str.getClass();
            switch (str) {
                case "dangal":
                case "dangalFHD":
                case "dangalUHD":
                case "oneday":
                case "aquaman":
                case "magnolia":
                case "once":
                case "machuca":
                    return true;
            }
        }
        if (i10 <= 27 && "HWEML".equals(c0.f55770b)) {
            return true;
        }
        String str2 = c0.f55772d;
        str2.getClass();
        switch (str2) {
            case "AFTJMST12":
            case "AFTKMST12":
            case "AFTA":
            case "AFTN":
            case "AFTR":
            case "AFTEU011":
            case "AFTEU014":
            case "AFTSO001":
            case "AFTEUFF014":
                return true;
            default:
                if (i10 <= 26) {
                    String str3 = c0.f55770b;
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -2144781245:
                            b10 = !str3.equals("GIONEE_SWW1609") ? (byte) -1 : (byte) 0;
                            break;
                        case -2144781185:
                            b10 = !str3.equals("GIONEE_SWW1627") ? (byte) -1 : (byte) 1;
                            break;
                        case -2144781160:
                            b10 = !str3.equals("GIONEE_SWW1631") ? (byte) -1 : (byte) 2;
                            break;
                        case -2097309513:
                            b10 = !str3.equals("K50a40") ? (byte) -1 : (byte) 3;
                            break;
                        case -2022874474:
                            b10 = !str3.equals(trPLwhKZgZ.ahywf) ? (byte) -1 : (byte) 4;
                            break;
                        case -1978993182:
                            b10 = !str3.equals("NX541J") ? (byte) -1 : (byte) 5;
                            break;
                        case -1978990237:
                            b10 = !str3.equals("NX573J") ? (byte) -1 : (byte) 6;
                            break;
                        case -1936688988:
                            if (!str3.equals("PGN528")) {
                                b10 = -1;
                            }
                            break;
                        case -1936688066:
                            b10 = !str3.equals("PGN610") ? (byte) -1 : (byte) 8;
                            break;
                        case -1936688065:
                            b10 = !str3.equals("PGN611") ? (byte) -1 : (byte) 9;
                            break;
                        case -1931988508:
                            b10 = !str3.equals("AquaPowerM") ? (byte) -1 : (byte) 10;
                            break;
                        case -1885099851:
                            b10 = !str3.equals("RAIJIN") ? (byte) -1 : (byte) 11;
                            break;
                        case -1696512866:
                            b10 = !str3.equals("XT1663") ? (byte) -1 : (byte) 12;
                            break;
                        case -1680025915:
                            b10 = !str3.equals("ComioS1") ? (byte) -1 : (byte) 13;
                            break;
                        case -1615810839:
                            b10 = !str3.equals("Phantom6") ? (byte) -1 : (byte) 14;
                            break;
                        case -1600724499:
                            b10 = !str3.equals("pacificrim") ? (byte) -1 : (byte) 15;
                            break;
                        case -1554255044:
                            b10 = !str3.equals("vernee_M5") ? (byte) -1 : (byte) 16;
                            break;
                        case -1481772737:
                            b10 = !str3.equals("panell_dl") ? (byte) -1 : (byte) 17;
                            break;
                        case -1481772730:
                            b10 = !str3.equals("panell_ds") ? (byte) -1 : (byte) 18;
                            break;
                        case -1481772729:
                            b10 = !str3.equals("panell_dt") ? (byte) -1 : (byte) 19;
                            break;
                        case -1320080169:
                            b10 = !str3.equals("GiONEE_GBL7319") ? (byte) -1 : (byte) 20;
                            break;
                        case -1217592143:
                            b10 = !str3.equals("BRAVIA_ATV2") ? (byte) -1 : (byte) 21;
                            break;
                        case -1180384755:
                            b10 = !str3.equals("iris60") ? (byte) -1 : (byte) 22;
                            break;
                        case -1139198265:
                            b10 = !str3.equals("Slate_Pro") ? (byte) -1 : (byte) 23;
                            break;
                        case -1052835013:
                            b10 = !str3.equals("namath") ? (byte) -1 : (byte) 24;
                            break;
                        case -993250464:
                            b10 = !str3.equals("A10-70F") ? (byte) -1 : (byte) 25;
                            break;
                        case -993250458:
                            b10 = !str3.equals("A10-70L") ? (byte) -1 : (byte) 26;
                            break;
                        case -965403638:
                            b10 = !str3.equals("s905x018") ? (byte) -1 : (byte) 27;
                            break;
                        case -958336948:
                            b10 = !str3.equals("ELUGA_Ray_X") ? (byte) -1 : (byte) 28;
                            break;
                        case -879245230:
                            b10 = !str3.equals("tcl_eu") ? (byte) -1 : (byte) 29;
                            break;
                        case -842500323:
                            b10 = !str3.equals("nicklaus_f") ? (byte) -1 : (byte) 30;
                            break;
                        case -821392978:
                            b10 = !str3.equals("A7000-a") ? (byte) -1 : (byte) 31;
                            break;
                        case -797483286:
                            b10 = !str3.equals("SVP-DTV15") ? (byte) -1 : (byte) 32;
                            break;
                        case -794946968:
                            b10 = !str3.equals("watson") ? (byte) -1 : (byte) 33;
                            break;
                        case -788334647:
                            b10 = !str3.equals("whyred") ? (byte) -1 : (byte) 34;
                            break;
                        case -782144577:
                            b10 = !str3.equals("OnePlus5T") ? (byte) -1 : (byte) 35;
                            break;
                        case -575125681:
                            b10 = !str3.equals("GiONEE_CBL7513") ? (byte) -1 : (byte) 36;
                            break;
                        case -521118391:
                            b10 = !str3.equals("GIONEE_GBL7360") ? (byte) -1 : (byte) 37;
                            break;
                        case -430914369:
                            b10 = !str3.equals("Pixi4-7_3G") ? (byte) -1 : (byte) 38;
                            break;
                        case -290434366:
                            b10 = !str3.equals("taido_row") ? (byte) -1 : (byte) 39;
                            break;
                        case -282781963:
                            b10 = !str3.equals("BLACK-1X") ? (byte) -1 : (byte) 40;
                            break;
                        case -277133239:
                            b10 = !str3.equals("Z12_PRO") ? (byte) -1 : (byte) 41;
                            break;
                        case -173639913:
                            b10 = !str3.equals("ELUGA_A3_Pro") ? (byte) -1 : (byte) 42;
                            break;
                        case -56598463:
                            b10 = !str3.equals("woods_fn") ? (byte) -1 : (byte) 43;
                            break;
                        case 2126:
                            b10 = !str3.equals("C1") ? (byte) -1 : (byte) 44;
                            break;
                        case 2564:
                            b10 = !str3.equals("Q5") ? (byte) -1 : (byte) 45;
                            break;
                        case 2715:
                            b10 = !str3.equals("V1") ? (byte) -1 : (byte) 46;
                            break;
                        case 2719:
                            b10 = !str3.equals("V5") ? (byte) -1 : (byte) 47;
                            break;
                        case 3091:
                            b10 = !str3.equals("b5") ? (byte) -1 : (byte) 48;
                            break;
                        case 3483:
                            b10 = !str3.equals("mh") ? (byte) -1 : (byte) 49;
                            break;
                        case 73405:
                            b10 = !str3.equals("JGZ") ? (byte) -1 : (byte) 50;
                            break;
                        case 75537:
                            b10 = !str3.equals("M04") ? (byte) -1 : (byte) 51;
                            break;
                        case 75739:
                            b10 = !str3.equals("M5c") ? (byte) -1 : (byte) 52;
                            break;
                        case 76779:
                            b10 = !str3.equals("MX6") ? (byte) -1 : (byte) 53;
                            break;
                        case 78669:
                            b10 = !str3.equals("P85") ? (byte) -1 : (byte) 54;
                            break;
                        case 79305:
                            b10 = !str3.equals("PLE") ? (byte) -1 : (byte) 55;
                            break;
                        case 80618:
                            b10 = !str3.equals("QX1") ? (byte) -1 : (byte) 56;
                            break;
                        case 88274:
                            b10 = !str3.equals("Z80") ? (byte) -1 : (byte) 57;
                            break;
                        case 98846:
                            b10 = !str3.equals("cv1") ? (byte) -1 : (byte) 58;
                            break;
                        case 98848:
                            b10 = !str3.equals("cv3") ? (byte) -1 : (byte) 59;
                            break;
                        case 99329:
                            b10 = !str3.equals("deb") ? (byte) -1 : (byte) 60;
                            break;
                        case 101481:
                            b10 = !str3.equals("flo") ? (byte) -1 : (byte) 61;
                            break;
                        case 1513190:
                            b10 = !str3.equals("1601") ? (byte) -1 : (byte) 62;
                            break;
                        case 1514184:
                            b10 = !str3.equals("1713") ? (byte) -1 : (byte) 63;
                            break;
                        case 1514185:
                            b10 = !str3.equals("1714") ? (byte) -1 : (byte) 64;
                            break;
                        case 2133089:
                            b10 = !str3.equals("F01H") ? (byte) -1 : (byte) 65;
                            break;
                        case 2133091:
                            b10 = !str3.equals("F01J") ? (byte) -1 : (byte) 66;
                            break;
                        case 2133120:
                            b10 = !str3.equals("F02H") ? (byte) -1 : (byte) 67;
                            break;
                        case 2133151:
                            b10 = !str3.equals("F03H") ? (byte) -1 : (byte) 68;
                            break;
                        case 2133182:
                            b10 = !str3.equals("F04H") ? (byte) -1 : (byte) 69;
                            break;
                        case 2133184:
                            b10 = !str3.equals("F04J") ? (byte) -1 : (byte) 70;
                            break;
                        case 2436959:
                            b10 = !str3.equals("P681") ? (byte) -1 : (byte) 71;
                            break;
                        case 2463773:
                            b10 = !str3.equals("Q350") ? (byte) -1 : (byte) 72;
                            break;
                        case 2464648:
                            b10 = !str3.equals("Q427") ? (byte) -1 : (byte) 73;
                            break;
                        case 2689555:
                            b10 = !str3.equals("XE2X") ? (byte) -1 : (byte) 74;
                            break;
                        case 3154429:
                            b10 = !str3.equals("fugu") ? (byte) -1 : (byte) 75;
                            break;
                        case 3284551:
                            b10 = !str3.equals("kate") ? (byte) -1 : (byte) 76;
                            break;
                        case 3351335:
                            b10 = !str3.equals("mido") ? (byte) -1 : (byte) 77;
                            break;
                        case 3386211:
                            b10 = !str3.equals("p212") ? (byte) -1 : (byte) 78;
                            break;
                        case 41325051:
                            b10 = !str3.equals("MEIZU_M5") ? (byte) -1 : (byte) 79;
                            break;
                        case 51349633:
                            b10 = !str3.equals("601LV") ? (byte) -1 : (byte) 80;
                            break;
                        case 51350594:
                            b10 = !str3.equals("602LV") ? (byte) -1 : (byte) 81;
                            break;
                        case 55178625:
                            b10 = !str3.equals("Aura_Note_2") ? (byte) -1 : (byte) 82;
                            break;
                        case 61542055:
                            b10 = !str3.equals("A1601") ? (byte) -1 : (byte) 83;
                            break;
                        case 65355429:
                            b10 = !str3.equals("E5643") ? (byte) -1 : (byte) 84;
                            break;
                        case 66214468:
                            b10 = !str3.equals("F3111") ? (byte) -1 : (byte) 85;
                            break;
                        case 66214470:
                            b10 = !str3.equals("F3113") ? (byte) -1 : (byte) 86;
                            break;
                        case 66214473:
                            b10 = !str3.equals("F3116") ? (byte) -1 : (byte) 87;
                            break;
                        case 66215429:
                            b10 = !str3.equals("F3211") ? (byte) -1 : (byte) 88;
                            break;
                        case 66215431:
                            b10 = !str3.equals("F3213") ? (byte) -1 : (byte) 89;
                            break;
                        case 66215433:
                            b10 = !str3.equals("F3215") ? (byte) -1 : (byte) 90;
                            break;
                        case 66216390:
                            b10 = !str3.equals("F3311") ? (byte) -1 : (byte) 91;
                            break;
                        case 76402249:
                            b10 = !str3.equals("PRO7S") ? (byte) -1 : (byte) 92;
                            break;
                        case 76404105:
                            b10 = !str3.equals("Q4260") ? (byte) -1 : (byte) 93;
                            break;
                        case 76404911:
                            b10 = !str3.equals("Q4310") ? (byte) -1 : (byte) 94;
                            break;
                        case 80963634:
                            b10 = !str3.equals("V23GB") ? (byte) -1 : (byte) 95;
                            break;
                        case 82882791:
                            b10 = !str3.equals("X3_HK") ? (byte) -1 : (byte) 96;
                            break;
                        case 98715550:
                            b10 = !str3.equals("i9031") ? (byte) -1 : (byte) 97;
                            break;
                        case 101370885:
                            b10 = !str3.equals("l5460") ? (byte) -1 : (byte) 98;
                            break;
                        case 102844228:
                            b10 = !str3.equals("le_x6") ? (byte) -1 : (byte) 99;
                            break;
                        case 165221241:
                            b10 = !str3.equals("A2016a40") ? (byte) -1 : (byte) 100;
                            break;
                        case 182191441:
                            b10 = !str3.equals("CPY83_I00") ? (byte) -1 : (byte) 101;
                            break;
                        case 245388979:
                            b10 = !str3.equals("marino_f") ? (byte) -1 : (byte) 102;
                            break;
                        case 287431619:
                            b10 = !str3.equals("griffin") ? (byte) -1 : (byte) 103;
                            break;
                        case 307593612:
                            b10 = !str3.equals("A7010a48") ? (byte) -1 : (byte) 104;
                            break;
                        case 308517133:
                            b10 = !str3.equals("A7020a48") ? (byte) -1 : (byte) 105;
                            break;
                        case 316215098:
                            b10 = !str3.equals(qEagQqzJZsd.kGsD) ? (byte) -1 : (byte) 106;
                            break;
                        case 316215116:
                            b10 = !str3.equals("TB3-730X") ? (byte) -1 : (byte) 107;
                            break;
                        case 316246811:
                            b10 = !str3.equals("TB3-850F") ? (byte) -1 : (byte) 108;
                            break;
                        case 316246818:
                            b10 = !str3.equals("TB3-850M") ? (byte) -1 : (byte) 109;
                            break;
                        case 407160593:
                            b10 = !str3.equals("Pixi5-10_4G") ? (byte) -1 : (byte) 110;
                            break;
                        case 507412548:
                            b10 = !str3.equals("QM16XE_U") ? (byte) -1 : (byte) 111;
                            break;
                        case 793982701:
                            b10 = !str3.equals("GIONEE_WBL5708") ? (byte) -1 : (byte) 112;
                            break;
                        case 794038622:
                            b10 = !str3.equals("GIONEE_WBL7365") ? (byte) -1 : (byte) 113;
                            break;
                        case 794040393:
                            b10 = !str3.equals("GIONEE_WBL7519") ? (byte) -1 : (byte) 114;
                            break;
                        case 835649806:
                            b10 = !str3.equals("manning") ? (byte) -1 : (byte) 115;
                            break;
                        case 917340916:
                            b10 = !str3.equals("A7000plus") ? (byte) -1 : (byte) 116;
                            break;
                        case 958008161:
                            b10 = !str3.equals("j2xlteins") ? (byte) -1 : (byte) 117;
                            break;
                        case 1060579533:
                            b10 = !str3.equals("panell_d") ? (byte) -1 : (byte) 118;
                            break;
                        case 1150207623:
                            b10 = !str3.equals("LS-5017") ? (byte) -1 : (byte) 119;
                            break;
                        case 1176899427:
                            b10 = !str3.equals("itel_S41") ? (byte) -1 : (byte) 120;
                            break;
                        case 1280332038:
                            b10 = !str3.equals("hwALE-H") ? (byte) -1 : (byte) 121;
                            break;
                        case 1306947716:
                            b10 = !str3.equals("EverStar_S") ? (byte) -1 : (byte) 122;
                            break;
                        case 1349174697:
                            b10 = !str3.equals("htc_e56ml_dtul") ? (byte) -1 : (byte) 123;
                            break;
                        case 1522194893:
                            b10 = !str3.equals("woods_f") ? (byte) -1 : (byte) 124;
                            break;
                        case 1691543273:
                            b10 = !str3.equals("CPH1609") ? (byte) -1 : (byte) 125;
                            break;
                        case 1691544261:
                            b10 = !str3.equals("CPH1715") ? (byte) -1 : (byte) 126;
                            break;
                        case 1709443163:
                            b10 = !str3.equals("iball8735_9806") ? (byte) -1 : (byte) 127;
                            break;
                        case 1865889110:
                            b10 = !str3.equals("santoni") ? (byte) -1 : (byte) 128;
                            break;
                        case 1906253259:
                            b10 = !str3.equals("PB2-670M") ? (byte) -1 : (byte) 129;
                            break;
                        case 1977196784:
                            b10 = !str3.equals("Infinix-X572") ? (byte) -1 : (byte) 130;
                            break;
                        case 2006372676:
                            b10 = !str3.equals("BRAVIA_ATV3_4K") ? (byte) -1 : (byte) 131;
                            break;
                        case 2019281702:
                            b10 = !str3.equals("DM-01K") ? (byte) -1 : (byte) 132;
                            break;
                        case 2029784656:
                            b10 = !str3.equals("HWBLN-H") ? (byte) -1 : (byte) 133;
                            break;
                        case 2030379515:
                            b10 = !str3.equals("HWCAM-H") ? (byte) -1 : (byte) 134;
                            break;
                        case 2033393791:
                            b10 = !str3.equals("ASUS_X00AD_2") ? (byte) -1 : (byte) 135;
                            break;
                        case 2047190025:
                            b10 = !str3.equals("ELUGA_Note") ? (byte) -1 : (byte) 136;
                            break;
                        case 2047252157:
                            b10 = !str3.equals("ELUGA_Prim") ? (byte) -1 : (byte) 137;
                            break;
                        case 2048319463:
                            b10 = !str3.equals("HWVNS-H") ? (byte) -1 : (byte) 138;
                            break;
                        case 2048855701:
                            b10 = !str3.equals("HWWAS-H") ? (byte) -1 : (byte) 139;
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    switch (b10) {
                        default:
                            str2.getClass();
                            if (!str2.equals("JSN-L21")) {
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case SDK_INIT_API_VALUE:
                        case AD_START_EVENT_VALUE:
                        case AD_CLICK_EVENT_VALUE:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case AD_VISIBILITY_VALUE:
                        case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                        case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                        case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                        case 60:
                        case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                        case DEPRECATED_API_USED_VALUE:
                        case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                        case 64:
                        case 65:
                        case BLACK_SCREEN_IS_DETECTED_VALUE:
                        case NATIVE_PLAY_ASSET_TYPE_VALUE:
                        case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                        case NATIVE_AD_DISPLAY_DURATION_VALUE:
                        case ASSET_DOWNLOAD_RETRY_STATUS_VALUE:
                        case AD_VISIBLE_DURATION_MS_VALUE:
                        case XtraBox.MP4_XTRA_BT_GUID /* 72 */:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                        case 81:
                        case 82:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                        case 88:
                        case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                        case 90:
                        case 91:
                        case 92:
                        case 93:
                        case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                        case 95:
                        case 96:
                        case 97:
                        case 98:
                        case 99:
                        case 100:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case 106:
                        case 107:
                        case 108:
                        case 109:
                        case 110:
                        case 111:
                        case ASSET_REQUEST_ERROR_VALUE:
                        case ASSET_RESPONSE_DATA_ERROR_VALUE:
                        case ASSET_WRITE_ERROR_VALUE:
                        case INVALID_INDEX_URL_VALUE:
                        case GZIP_ENCODE_ERROR_VALUE:
                        case ASSET_FAILED_STATUS_CODE_VALUE:
                        case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                        case JSON_ENCODE_ERROR_VALUE:
                        case AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL /* 120 */:
                        case TPAT_ERROR_VALUE:
                        case INVALID_ADS_ENDPOINT_VALUE:
                        case INVALID_RI_ENDPOINT_VALUE:
                        case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                        case INVALID_METRICS_ENDPOINT_VALUE:
                        case ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:
                        case ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE:
                        case 128:
                        case 129:
                        case 130:
                        case MRAID_JS_WRITE_FAILED_VALUE:
                        case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                        case OMSDK_JS_WRITE_FAILED_VALUE:
                        case 134:
                        case 135:
                        case PRIVACY_URL_ERROR_VALUE:
                        case TPAT_RETRY_FAILED_VALUE:
                        case 138:
                        case 139:
                            return true;
                    }
                }
                return false;
        }
    }

    public static int U1(j jVar, o oVar) {
        int iIntValue;
        int i10 = oVar.f52763t;
        int i11 = oVar.f52764u;
        if (i10 == -1 || i11 == -1) {
            return -1;
        }
        String str = (String) w1.a.e(oVar.f52757n);
        if ("video/dolby-vision".equals(str)) {
            Pair pairR = MediaCodecUtil.r(oVar);
            str = (pairR == null || !((iIntValue = ((Integer) pairR.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? MimeTypes.VIDEO_H265 : MimeTypes.VIDEO_H264;
        }
        str.getClass();
        switch (str) {
            case "video/3gpp":
            case "video/av01":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                return Z1(i10 * i11, 2);
            case "video/hevc":
                return Math.max(2097152, Z1(i10 * i11, 2));
            case "video/avc":
                String str2 = c0.f55772d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(c0.f55771c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && jVar.f5623g)))) {
                    return -1;
                }
                return Z1(c0.j(i10, 16) * c0.j(i11, 16) * 256, 2);
            case "video/x-vnd.on2.vp9":
                return Z1(i10 * i11, 4);
            default:
                return -1;
        }
    }

    private static Point V1(j jVar, o oVar) {
        int i10 = oVar.f52764u;
        int i11 = oVar.f52763t;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : f6172o1) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            if (c0.f55769a >= 21) {
                int i15 = z10 ? i14 : i13;
                if (!z10) {
                    i13 = i14;
                }
                Point pointB = jVar.b(i15, i13);
                float f11 = oVar.f52765v;
                if (pointB != null && jVar.u(pointB.x, pointB.y, f11)) {
                    return pointB;
                }
            } else {
                try {
                    int iJ = c0.j(i13, 16) * 16;
                    int iJ2 = c0.j(i14, 16) * 16;
                    if (iJ * iJ2 <= MediaCodecUtil.L()) {
                        int i16 = z10 ? iJ2 : iJ;
                        if (!z10) {
                            iJ = iJ2;
                        }
                        return new Point(i16, iJ);
                    }
                } catch (MediaCodecUtil.DecoderQueryException unused) {
                }
            }
        }
        return null;
    }

    private static List X1(Context context, l lVar, o oVar, boolean z10, boolean z11) {
        String str = oVar.f52757n;
        if (str == null) {
            return com.google.common.collect.c0.C();
        }
        if (c0.f55769a >= 26 && "video/dolby-vision".equals(str) && !b.a(context)) {
            List listN = MediaCodecUtil.n(lVar, oVar, z10, z11);
            if (!listN.isEmpty()) {
                return listN;
            }
        }
        return MediaCodecUtil.v(lVar, oVar, z10, z11);
    }

    protected static int Y1(j jVar, o oVar) {
        if (oVar.f52758o == -1) {
            return U1(jVar, oVar);
        }
        int size = oVar.f52760q.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += ((byte[]) oVar.f52760q.get(i10)).length;
        }
        return oVar.f52758o + length;
    }

    private static int Z1(int i10, int i11) {
        return (i10 * 3) / (i11 * 2);
    }

    private void c2() {
        if (this.f6176b1 > 0) {
            long jElapsedRealtime = D().elapsedRealtime();
            this.K0.n(this.f6176b1, jElapsedRealtime - this.f6175a1);
            this.f6176b1 = 0;
            this.f6175a1 = jElapsedRealtime;
        }
    }

    private void d2() {
        if (!this.N0.i() || this.V0 == null) {
            return;
        }
        m2();
    }

    private void e2() {
        int i10 = this.f6180f1;
        if (i10 != 0) {
            this.K0.r(this.f6179e1, i10);
            this.f6179e1 = 0L;
            this.f6180f1 = 0;
        }
    }

    private void f2(g0 g0Var) {
        if (g0Var.equals(g0.f52689e) || g0Var.equals(this.f6183i1)) {
            return;
        }
        this.f6183i1 = g0Var;
        this.K0.t(g0Var);
    }

    private boolean g2(androidx.media3.exoplayer.mediacodec.h hVar, int i10, long j10, o oVar) {
        long jG = this.O0.g();
        long jF = this.O0.f();
        if (c0.f55769a >= 21) {
            if (B2() && jG == this.f6181g1) {
                D2(hVar, i10, j10);
            } else {
                l2(j10, jG, oVar);
                t2(hVar, i10, j10, jG);
                jG = jG;
            }
            G2(jF);
            this.f6181g1 = jG;
            return true;
        }
        if (jF >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
            return false;
        }
        if (jF > 11000) {
            try {
                Thread.sleep((jF - 10000) / 1000);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        l2(j10, jG, oVar);
        r2(hVar, i10, j10);
        G2(jF);
        return true;
    }

    private void h2() {
        Surface surface = this.V0;
        if (surface == null || !this.Y0) {
            return;
        }
        this.K0.q(surface);
    }

    private void i2() {
        g0 g0Var = this.f6183i1;
        if (g0Var != null) {
            this.K0.t(g0Var);
        }
    }

    private void j2(MediaFormat mediaFormat) {
        VideoSink videoSink = this.S0;
        if (videoSink == null || videoSink.h()) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
    }

    private void k2() {
        int i10;
        androidx.media3.exoplayer.mediacodec.h hVarX0;
        if (!this.f6185k1 || (i10 = c0.f55769a) < 23 || (hVarX0 = x0()) == null) {
            return;
        }
        this.f6187m1 = new d(hVarX0);
        if (i10 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            hVarX0.b(bundle);
        }
    }

    private void l2(long j10, long j11, o oVar) {
        m2.f fVar = this.f6188n1;
        if (fVar != null) {
            fVar.d(j10, j11, oVar, C0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m2() {
        this.K0.q(this.V0);
        this.Y0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o2() {
        w1();
    }

    private void q2() {
        Surface surface = this.V0;
        m2.e eVar = this.W0;
        if (surface == eVar) {
            this.V0 = null;
        }
        if (eVar != null) {
            eVar.release();
            this.W0 = null;
        }
    }

    private void s2(androidx.media3.exoplayer.mediacodec.h hVar, int i10, long j10, long j11) {
        if (c0.f55769a >= 21) {
            t2(hVar, i10, j10, j11);
        } else {
            r2(hVar, i10, j10);
        }
    }

    private static void u2(androidx.media3.exoplayer.mediacodec.h hVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        hVar.b(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.media3.exoplayer.video.g] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.media3.exoplayer.h, androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.video.f] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r6v8, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void v2(Object obj) throws ExoPlaybackException {
        ?? C;
        Surface surface;
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            C = 0;
        }
        if (C == 0) {
            m2.e eVar = this.W0;
            if (eVar != null) {
                C = surface;
                C = eVar;
            } else {
                j jVarZ0 = z0();
                if (jVarZ0 != null && C2(jVarZ0)) {
                    C = surface;
                    C = m2.e.c(this.H0, jVarZ0.f5623g);
                    this.W0 = C;
                }
            }
        }
        C = surface;
        C = surface;
        C = surface;
        if (this.V0 == C) {
            if (C == 0 || C == this.W0) {
                return;
            }
            i2();
            h2();
            return;
        }
        this.V0 = C;
        if (this.S0 == null) {
            this.N0.q(C);
        }
        this.Y0 = false;
        int state = getState();
        androidx.media3.exoplayer.mediacodec.h hVarX0 = x0();
        if (hVarX0 != null && this.S0 == null) {
            if (c0.f55769a < 23 || C == 0 || this.Q0) {
                o1();
                X0();
            } else {
                w2(hVarX0, C);
            }
        }
        if (C == 0 || C == this.W0) {
            this.f6183i1 = null;
            VideoSink videoSink = this.S0;
            if (videoSink != null) {
                videoSink.p();
            }
        } else {
            i2();
            if (state == 2) {
                this.N0.e(true);
            }
        }
        k2();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean A0() {
        return this.f6185k1 && c0.f55769a < 23;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean A1(j jVar) {
        return this.V0 != null || C2(jVar);
    }

    protected boolean A2(long j10, long j11) {
        return j10 < -30000 && j11 > 100000;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected float B0(float f10, o oVar, o[] oVarArr) {
        float fMax = -1.0f;
        for (o oVar2 : oVarArr) {
            float f11 = oVar2.f52765v;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    protected boolean B2() {
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected List D0(l lVar, o oVar, boolean z10) {
        return MediaCodecUtil.w(X1(this.H0, lVar, oVar, z10, this.f6185k1), oVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected int D1(l lVar, o oVar) {
        boolean z10;
        int i10 = 0;
        if (!t1.v.k(oVar.f52757n)) {
            return g2.h(0);
        }
        boolean z11 = oVar.f52761r != null;
        List listX1 = X1(this.H0, lVar, oVar, z11, false);
        if (z11 && listX1.isEmpty()) {
            listX1 = X1(this.H0, lVar, oVar, false, false);
        }
        if (listX1.isEmpty()) {
            return g2.h(1);
        }
        if (!MediaCodecRenderer.E1(oVar)) {
            return g2.h(2);
        }
        j jVar = (j) listX1.get(0);
        boolean zM = jVar.m(oVar);
        if (!zM) {
            int i11 = 1;
            while (true) {
                if (i11 >= listX1.size()) {
                    z10 = true;
                    break;
                }
                j jVar2 = (j) listX1.get(i11);
                if (jVar2.m(oVar)) {
                    z10 = false;
                    zM = true;
                    jVar = jVar2;
                    break;
                }
                i11++;
            }
        } else {
            z10 = true;
            break;
        }
        int i12 = zM ? 4 : 3;
        int i13 = jVar.p(oVar) ? 16 : 8;
        int i14 = jVar.f5624h ? 64 : 0;
        int i15 = z10 ? 128 : 0;
        if (c0.f55769a >= 26 && "video/dolby-vision".equals(oVar.f52757n) && !b.a(this.H0)) {
            i15 = 256;
        }
        if (zM) {
            List listX2 = X1(this.H0, lVar, oVar, z11, true);
            if (!listX2.isEmpty()) {
                j jVar3 = (j) MediaCodecUtil.w(listX2, oVar).get(0);
                if (jVar3.m(oVar) && jVar3.p(oVar)) {
                    i10 = 32;
                }
            }
        }
        return g2.e(i12, i13, i10, i14, i15);
    }

    protected void D2(androidx.media3.exoplayer.mediacodec.h hVar, int i10, long j10) {
        a0.a("skipVideoBuffer");
        hVar.k(i10, false);
        a0.b();
        this.C0.f5387f++;
    }

    protected void F2(int i10, int i11) {
        androidx.media3.exoplayer.i iVar = this.C0;
        iVar.f5389h += i10;
        int i12 = i10 + i11;
        iVar.f5388g += i12;
        this.f6176b1 += i12;
        int i13 = this.f6177c1 + i12;
        this.f6177c1 = i13;
        iVar.f5390i = Math.max(i13, iVar.f5390i);
        int i14 = this.L0;
        if (i14 <= 0 || this.f6176b1 < i14) {
            return;
        }
        c2();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected androidx.media3.exoplayer.mediacodec.h.a G0(j jVar, o oVar, MediaCrypto mediaCrypto, float f10) {
        m2.e eVar = this.W0;
        if (eVar != null && eVar.f45087a != jVar.f5623g) {
            q2();
        }
        String str = jVar.f5619c;
        c cVarW1 = W1(jVar, oVar, J());
        this.P0 = cVarW1;
        MediaFormat mediaFormatA2 = a2(oVar, str, cVarW1, f10, this.M0, this.f6185k1 ? this.f6186l1 : 0);
        if (this.V0 == null) {
            if (!C2(jVar)) {
                throw new IllegalStateException();
            }
            if (this.W0 == null) {
                this.W0 = m2.e.c(this.H0, jVar.f5623g);
            }
            this.V0 = this.W0;
        }
        j2(mediaFormatA2);
        VideoSink videoSink = this.S0;
        return androidx.media3.exoplayer.mediacodec.h.a.b(jVar, mediaFormatA2, oVar, videoSink != null ? videoSink.k() : this.V0, mediaCrypto);
    }

    protected void G2(long j10) {
        this.C0.a(j10);
        this.f6179e1 += j10;
        this.f6180f1++;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.h
    protected void L() {
        this.f6183i1 = null;
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            videoSink.n();
        } else {
            this.N0.g();
        }
        k2();
        this.Y0 = false;
        this.f6187m1 = null;
        try {
            super.L();
        } finally {
            this.K0.m(this.C0);
            this.K0.t(g0.f52689e);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void L0(DecoderInputBuffer decoderInputBuffer) {
        if (this.R0) {
            ByteBuffer byteBuffer = (ByteBuffer) w1.a.e(decoderInputBuffer.f4867g);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        u2((androidx.media3.exoplayer.mediacodec.h) w1.a.e(x0()), bArr);
                    }
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.h
    protected void M(boolean z10, boolean z11) {
        super.M(z10, z11);
        boolean z12 = E().f5381b;
        w1.a.g((z12 && this.f6186l1 == 0) ? false : true);
        if (this.f6185k1 != z12) {
            this.f6185k1 = z12;
            o1();
        }
        this.K0.o(this.C0);
        if (!this.T0) {
            if ((this.U0 != null || !this.J0) && this.S0 == null) {
                r rVarE = this.I0;
                if (rVarE == null) {
                    rVarE = new androidx.media3.exoplayer.video.a.b(this.H0, this.N0).f(D()).e();
                }
                this.S0 = rVarE.b();
            }
            this.T0 = true;
        }
        VideoSink videoSink = this.S0;
        if (videoSink == null) {
            this.N0.o(D());
            this.N0.h(z11);
            return;
        }
        videoSink.t(new a(), com.google.common.util.concurrent.g0.a());
        m2.f fVar = this.f6188n1;
        if (fVar != null) {
            this.S0.j(fVar);
        }
        if (this.V0 != null && !this.X0.equals(v.f55847c)) {
            this.S0.s(this.V0, this.X0);
        }
        this.S0.o(J0());
        List list = this.U0;
        if (list != null) {
            this.S0.e(list);
        }
        this.S0.i(z11);
    }

    @Override // androidx.media3.exoplayer.h
    protected void N() {
        super.N();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.h
    protected void O(long j10, boolean z10) throws ExoPlaybackException {
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            videoSink.r(true);
            this.S0.g(H0(), T1());
        }
        super.O(j10, z10);
        if (this.S0 == null) {
            this.N0.m();
        }
        if (z10) {
            this.N0.e(false);
        }
        k2();
        this.f6177c1 = 0;
    }

    protected boolean O1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (f.class) {
            try {
                if (!f6173p1) {
                    f6174q1 = S1();
                    f6173p1 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f6174q1;
    }

    @Override // androidx.media3.exoplayer.h
    protected void P() {
        super.P();
        VideoSink videoSink = this.S0;
        if (videoSink == null || !this.J0) {
            return;
        }
        videoSink.release();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.h
    protected void R() {
        try {
            super.R();
        } finally {
            this.T0 = false;
            if (this.W0 != null) {
                q2();
            }
        }
    }

    protected void R1(androidx.media3.exoplayer.mediacodec.h hVar, int i10, long j10) {
        a0.a("dropVideoBuffer");
        hVar.k(i10, false);
        a0.b();
        F2(0, 1);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.h
    protected void S() {
        super.S();
        this.f6176b1 = 0;
        this.f6175a1 = D().elapsedRealtime();
        this.f6179e1 = 0L;
        this.f6180f1 = 0;
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            videoSink.l();
        } else {
            this.N0.k();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.h
    protected void T() {
        c2();
        e2();
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            videoSink.d();
        } else {
            this.N0.l();
        }
        super.T();
    }

    protected long T1() {
        return 0L;
    }

    protected c W1(j jVar, o oVar, o[] oVarArr) {
        int iU1;
        int iMax = oVar.f52763t;
        int iMax2 = oVar.f52764u;
        int iY1 = Y1(jVar, oVar);
        if (oVarArr.length == 1) {
            if (iY1 != -1 && (iU1 = U1(jVar, oVar)) != -1) {
                iY1 = Math.min((int) (iY1 * 1.5f), iU1);
            }
            return new c(iMax, iMax2, iY1);
        }
        int length = oVarArr.length;
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10++) {
            o oVarK = oVarArr[i10];
            if (oVar.A != null && oVarK.A == null) {
                oVarK = oVarK.a().P(oVar.A).K();
            }
            if (jVar.e(oVar, oVarK).f5404d != 0) {
                int i11 = oVarK.f52763t;
                z10 |= i11 == -1 || oVarK.f52764u == -1;
                iMax = Math.max(iMax, i11);
                iMax2 = Math.max(iMax2, oVarK.f52764u);
                iY1 = Math.max(iY1, Y1(jVar, oVarK));
            }
        }
        if (z10) {
            n.h("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point pointV1 = V1(jVar, oVar);
            if (pointV1 != null) {
                iMax = Math.max(iMax, pointV1.x);
                iMax2 = Math.max(iMax2, pointV1.y);
                iY1 = Math.max(iY1, U1(jVar, oVar.a().t0(iMax).Y(iMax2).K()));
                n.h("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new c(iMax, iMax2, iY1);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void Z0(Exception exc) {
        n.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.K0.s(exc);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void a1(String str, androidx.media3.exoplayer.mediacodec.h.a aVar, long j10, long j11) {
        this.K0.k(str, j10, j11);
        this.Q0 = O1(str);
        this.R0 = ((j) w1.a.e(z0())).n();
        k2();
    }

    protected MediaFormat a2(o oVar, String str, c cVar, float f10, boolean z10, int i10) {
        Pair pairR;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", oVar.f52763t);
        mediaFormat.setInteger("height", oVar.f52764u);
        q.e(mediaFormat, oVar.f52760q);
        q.c(mediaFormat, "frame-rate", oVar.f52765v);
        q.d(mediaFormat, "rotation-degrees", oVar.f52766w);
        q.b(mediaFormat, oVar.A);
        if ("video/dolby-vision".equals(oVar.f52757n) && (pairR = MediaCodecUtil.r(oVar)) != null) {
            q.d(mediaFormat, Scopes.PROFILE, ((Integer) pairR.first).intValue());
        }
        mediaFormat.setInteger("max-width", cVar.f6190a);
        mediaFormat.setInteger("max-height", cVar.f6191b);
        q.d(mediaFormat, "max-input-size", cVar.f6192c);
        int i11 = c0.f55769a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            P1(mediaFormat, i10);
        }
        if (i11 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f6184j1));
        }
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.f2
    public void b() {
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            videoSink.b();
        } else {
            this.N0.a();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void b1(String str) {
        this.K0.l(str);
    }

    protected boolean b2(long j10, boolean z10) throws ExoPlaybackException {
        int iY = Y(j10);
        if (iY == 0) {
            return false;
        }
        if (z10) {
            androidx.media3.exoplayer.i iVar = this.C0;
            iVar.f5385d += iY;
            iVar.f5387f += this.f6178d1;
        } else {
            this.C0.f5391j++;
            F2(iY, this.f6178d1);
        }
        u0();
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            videoSink.r(false);
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected androidx.media3.exoplayer.j c0(j jVar, o oVar, o oVar2) {
        androidx.media3.exoplayer.j jVarE = jVar.e(oVar, oVar2);
        int i10 = jVarE.f5405e;
        c cVar = (c) w1.a.e(this.P0);
        if (oVar2.f52763t > cVar.f6190a || oVar2.f52764u > cVar.f6191b) {
            i10 |= 256;
        }
        if (Y1(jVar, oVar2) > cVar.f6192c) {
            i10 |= 64;
        }
        int i11 = i10;
        return new androidx.media3.exoplayer.j(jVar.f5617a, oVar, oVar2, i11 != 0 ? 0 : jVarE.f5404d, i11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected androidx.media3.exoplayer.j c1(f1 f1Var) throws ExoPlaybackException {
        androidx.media3.exoplayer.j jVarC1 = super.c1(f1Var);
        this.K0.p((o) w1.a.e(f1Var.f5339b), jVarC1);
        return jVarC1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void d1(o oVar, MediaFormat mediaFormat) {
        int integer;
        int i10;
        androidx.media3.exoplayer.mediacodec.h hVarX0 = x0();
        if (hVarX0 != null) {
            hVarX0.setVideoScalingMode(this.Z0);
        }
        int i11 = 0;
        if (this.f6185k1) {
            i10 = oVar.f52763t;
            integer = oVar.f52764u;
        } else {
            w1.a.e(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i10 = integer2;
        }
        float f10 = oVar.f52767x;
        if (N1()) {
            int i12 = oVar.f52766w;
            if (i12 == 90 || i12 == 270) {
                f10 = 1.0f / f10;
                int i13 = integer;
                integer = i10;
                i10 = i13;
            }
        } else if (this.S0 == null) {
            i11 = oVar.f52766w;
        }
        this.f6182h1 = new g0(i10, integer, i11, f10);
        if (this.S0 == null) {
            this.N0.p(oVar.f52765v);
        } else {
            p2();
            this.S0.a(1, oVar.a().t0(i10).Y(integer).n0(i11).k0(f10).K());
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void f1(long j10) {
        super.f1(j10);
        if (this.f6185k1) {
            return;
        }
        this.f6178d1--;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void g1() {
        super.g1();
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            videoSink.g(H0(), T1());
        } else {
            this.N0.j();
        }
        k2();
    }

    @Override // androidx.media3.exoplayer.f2, androidx.media3.exoplayer.g2
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void h1(DecoderInputBuffer decoderInputBuffer) {
        boolean z10 = this.f6185k1;
        if (!z10) {
            this.f6178d1++;
        }
        if (c0.f55769a >= 23 || !z10) {
            return;
        }
        n2(decoderInputBuffer.f4866f);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.h, androidx.media3.exoplayer.d2.b
    public void handleMessage(int i10, Object obj) throws ExoPlaybackException {
        if (i10 == 1) {
            v2(obj);
            return;
        }
        if (i10 == 7) {
            m2.f fVar = (m2.f) w1.a.e(obj);
            this.f6188n1 = fVar;
            VideoSink videoSink = this.S0;
            if (videoSink != null) {
                videoSink.j(fVar);
                return;
            }
            return;
        }
        if (i10 == 10) {
            int iIntValue = ((Integer) w1.a.e(obj)).intValue();
            if (this.f6186l1 != iIntValue) {
                this.f6186l1 = iIntValue;
                if (this.f6185k1) {
                    o1();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 16) {
            this.f6184j1 = ((Integer) w1.a.e(obj)).intValue();
            E2();
            return;
        }
        if (i10 == 4) {
            this.Z0 = ((Integer) w1.a.e(obj)).intValue();
            androidx.media3.exoplayer.mediacodec.h hVarX0 = x0();
            if (hVarX0 != null) {
                hVarX0.setVideoScalingMode(this.Z0);
                return;
            }
            return;
        }
        if (i10 == 5) {
            this.N0.n(((Integer) w1.a.e(obj)).intValue());
            return;
        }
        if (i10 == 13) {
            x2((List) w1.a.e(obj));
            return;
        }
        if (i10 != 14) {
            super.handleMessage(i10, obj);
            return;
        }
        v vVar = (v) w1.a.e(obj);
        if (vVar.b() == 0 || vVar.a() == 0) {
            return;
        }
        this.X0 = vVar;
        VideoSink videoSink2 = this.S0;
        if (videoSink2 != null) {
            videoSink2.s((Surface) w1.a.i(this.V0), vVar);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void i1(o oVar) throws ExoPlaybackException {
        VideoSink videoSink = this.S0;
        if (videoSink == null || videoSink.isInitialized()) {
            return;
        }
        try {
            this.S0.u(oVar);
        } catch (VideoSink.VideoSinkException e10) {
            throw B(e10, oVar, 7000);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.f2
    public boolean isEnded() {
        if (!super.isEnded()) {
            return false;
        }
        VideoSink videoSink = this.S0;
        return videoSink == null || videoSink.isEnded();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.f2
    public boolean isReady() {
        m2.e eVar;
        VideoSink videoSink;
        boolean z10 = super.isReady() && ((videoSink = this.S0) == null || videoSink.isReady());
        if (z10 && (((eVar = this.W0) != null && this.V0 == eVar) || x0() == null || this.f6185k1)) {
            return true;
        }
        return this.N0.d(z10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.f2
    public void k(float f10, float f11) throws ExoPlaybackException {
        super.k(f10, f11);
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            videoSink.o(f10);
        } else {
            this.N0.r(f10);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean k1(long j10, long j11, androidx.media3.exoplayer.mediacodec.h hVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, o oVar) throws ExoPlaybackException {
        w1.a.e(hVar);
        long jH0 = j12 - H0();
        int iC = this.N0.c(j12, j10, j11, I0(), z11, this.O0);
        if (iC == 4) {
            return false;
        }
        if (z10 && !z11) {
            D2(hVar, i10, jH0);
            return true;
        }
        if (this.V0 == this.W0 && this.S0 == null) {
            if (this.O0.f() >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                return false;
            }
            D2(hVar, i10, jH0);
            G2(this.O0.f());
            return true;
        }
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            try {
                videoSink.render(j10, j11);
                long jC = this.S0.c(j12 + T1(), z11);
                if (jC == C.TIME_UNSET) {
                    return false;
                }
                s2(hVar, i10, jH0, jC);
                return true;
            } catch (VideoSink.VideoSinkException e10) {
                throw B(e10, e10.f6122a, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
            }
        }
        if (iC == 0) {
            long jNanoTime = D().nanoTime();
            l2(jH0, jNanoTime, oVar);
            s2(hVar, i10, jH0, jNanoTime);
            G2(this.O0.f());
            return true;
        }
        if (iC == 1) {
            return g2((androidx.media3.exoplayer.mediacodec.h) w1.a.i(hVar), i10, jH0, oVar);
        }
        if (iC == 2) {
            R1(hVar, i10, jH0);
            G2(this.O0.f());
            return true;
        }
        if (iC != 3) {
            if (iC == 5) {
                return false;
            }
            throw new IllegalStateException(String.valueOf(iC));
        }
        D2(hVar, i10, jH0);
        G2(this.O0.f());
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected MediaCodecDecoderException l0(Throwable th2, j jVar) {
        return new MediaCodecVideoDecoderException(th2, jVar, this.V0);
    }

    protected void n2(long j10) {
        H1(j10);
        f2(this.f6182h1);
        this.C0.f5386e++;
        d2();
        f1(j10);
    }

    protected void p2() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void q1() {
        super.q1();
        this.f6178d1 = 0;
    }

    protected void r2(androidx.media3.exoplayer.mediacodec.h hVar, int i10, long j10) {
        a0.a("releaseOutputBuffer");
        hVar.k(i10, true);
        a0.b();
        this.C0.f5386e++;
        this.f6177c1 = 0;
        if (this.S0 == null) {
            f2(this.f6182h1);
            d2();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.f2
    public void render(long j10, long j11) throws ExoPlaybackException {
        super.render(j10, j11);
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            try {
                videoSink.render(j10, j11);
            } catch (VideoSink.VideoSinkException e10) {
                throw B(e10, e10.f6122a, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
            }
        }
    }

    @Override // androidx.media3.exoplayer.video.g.b
    public boolean s(long j10, long j11) {
        return A2(j10, j11);
    }

    protected void t2(androidx.media3.exoplayer.mediacodec.h hVar, int i10, long j10, long j11) {
        a0.a("releaseOutputBuffer");
        hVar.g(i10, j11);
        a0.b();
        this.C0.f5386e++;
        this.f6177c1 = 0;
        if (this.S0 == null) {
            f2(this.f6182h1);
            d2();
        }
    }

    @Override // androidx.media3.exoplayer.video.g.b
    public boolean u(long j10, long j11, long j12, boolean z10, boolean z11) {
        return y2(j10, j12, z10) && b2(j11, z11);
    }

    protected void w2(androidx.media3.exoplayer.mediacodec.h hVar, Surface surface) {
        hVar.e(surface);
    }

    public void x2(List list) {
        this.U0 = list;
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            videoSink.e(list);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected int y0(DecoderInputBuffer decoderInputBuffer) {
        return (c0.f55769a < 34 || !this.f6185k1 || decoderInputBuffer.f4866f >= H()) ? 0 : 32;
    }

    protected boolean y2(long j10, long j11, boolean z10) {
        return j10 < -500000 && !z10;
    }

    @Override // androidx.media3.exoplayer.video.g.b
    public boolean z(long j10, long j11, boolean z10) {
        return z2(j10, j11, z10);
    }

    protected boolean z2(long j10, long j11, boolean z10) {
        return j10 < -30000 && !z10;
    }

    public f(Context context, androidx.media3.exoplayer.mediacodec.h.b bVar, l lVar, long j10, boolean z10, Handler handler, i iVar, int i10, float f10) {
        this(context, bVar, lVar, j10, z10, handler, iVar, i10, f10, null);
    }

    private static void P1(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger(Saucuwx.vtkxLcGyuyu, i10);
    }

    public f(Context context, androidx.media3.exoplayer.mediacodec.h.b bVar, l lVar, long j10, boolean z10, Handler handler, i iVar, int i10, float f10, r rVar) {
        super(2, bVar, lVar, z10, f10);
        Context applicationContext = context.getApplicationContext();
        this.H0 = applicationContext;
        this.L0 = i10;
        this.I0 = rVar;
        this.K0 = new i.a(handler, iVar);
        this.J0 = rVar == null;
        if (rVar == null) {
            this.N0 = new g(applicationContext, this, j10);
        } else {
            this.N0 = rVar.a();
        }
        this.O0 = new g.a();
        this.M0 = Q1();
        this.X0 = v.f55847c;
        this.Z0 = 1;
        this.f6182h1 = g0.f52689e;
        this.f6186l1 = 0;
        this.f6183i1 = null;
        this.f6184j1 = -1000;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class a implements VideoSink.a {
        a() {
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public void b(VideoSink videoSink) {
            w1.a.i(f.this.V0);
            f.this.m2();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public void c(VideoSink videoSink) {
            f.this.F2(0, 1);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public void a(VideoSink videoSink, g0 g0Var) {
        }
    }
}
