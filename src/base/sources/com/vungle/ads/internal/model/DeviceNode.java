package com.vungle.ads.internal.model;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.UnknownFieldException;
import tm.b2;
import tm.f1;
import tm.g2;
import tm.k0;
import tm.l0;
import tm.q2;
import tm.u0;
import tm.v2;
import wc.XtO.NpmRNZ;

/* JADX INFO: renamed from: com.vungle.ads.internal.model.h, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0003OPQBs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0085\u0001\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J(\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019HÇ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0012\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0088\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u001fJ\u0010\u00100\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b0\u0010%J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b8\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b9\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b:\u0010\u001fR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010%\"\u0004\b=\u0010>R\"\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010;\u001a\u0004\b?\u0010%\"\u0004\b@\u0010>R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00105\u001a\u0004\bA\u0010\u001f\"\u0004\bB\u0010CR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00105\u001a\u0004\bD\u0010\u001f\"\u0004\bE\u0010CR$\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010F\u001a\u0004\bG\u0010*\"\u0004\bH\u0010IR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010J\u001a\u0004\bK\u0010,\"\u0004\bL\u0010M¨\u0006R"}, d2 = {"Lcom/vungle/ads/internal/model/h;", "", "", "make", "model", "osv", "carrier", "os", "", "w", "h", "ua", "ifa", "lmt", "Lcom/vungle/ads/internal/model/h$c;", "ext", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/h$c;)V", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/h$c;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/h;Lsm/d;Lrm/f;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()I", "component7", "component8", "component9", "component10", "()Ljava/lang/Integer;", "component11", "()Lcom/vungle/ads/internal/model/h$c;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/vungle/ads/internal/model/h$c;)Lcom/vungle/ads/internal/model/h;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMake", "getModel", "getOsv", "getCarrier", "getOs", "I", "getW", "setW", "(I)V", "getH", "setH", "getUa", "setUa", "(Ljava/lang/String;)V", "getIfa", "setIfa", "Ljava/lang/Integer;", "getLmt", "setLmt", "(Ljava/lang/Integer;)V", "Lcom/vungle/ads/internal/model/h$c;", "getExt", "setExt", "(Lcom/vungle/ads/internal/model/h$c;)V", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@pm.k
public final /* data */ class DeviceNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String carrier;
    private VungleExt ext;
    private int h;
    private String ifa;
    private Integer lmt;
    private final String make;
    private final String model;
    private final String os;
    private final String osv;
    private String ua;
    private int w;

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.h$a */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements l0 {
        public static final a INSTANCE;
        public static final /* synthetic */ rm.f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            g2 g2Var = new g2("com.vungle.ads.internal.model.DeviceNode", aVar, 11);
            g2Var.p("make", false);
            g2Var.p("model", false);
            g2Var.p("osv", false);
            g2Var.p("carrier", true);
            g2Var.p("os", false);
            g2Var.p("w", false);
            g2Var.p("h", false);
            g2Var.p("ua", true);
            g2Var.p("ifa", true);
            g2Var.p("lmt", true);
            g2Var.p("ext", true);
            descriptor = g2Var;
        }

        private a() {
        }

        @Override // tm.l0
        public pm.d[] childSerializers() {
            v2 v2Var = v2.f53598a;
            pm.d dVarT = qm.a.t(v2Var);
            u0 u0Var = u0.f53588a;
            return new pm.d[]{v2Var, v2Var, v2Var, dVarT, v2Var, u0Var, u0Var, qm.a.t(v2Var), qm.a.t(v2Var), qm.a.t(u0Var), qm.a.t(VungleExt.a.INSTANCE)};
        }

        @Override // pm.c
        public DeviceNode deserialize(sm.e decoder) {
            int i10;
            Object objE;
            Object objE2;
            Object objE3;
            Object objE4;
            Object objE5;
            int i11;
            int i12;
            String str;
            String str2;
            String str3;
            String str4;
            s.h(decoder, "decoder");
            rm.f descriptor2 = getDescriptor();
            sm.c cVarB = decoder.b(descriptor2);
            int i13 = 10;
            int i14 = 9;
            if (cVarB.l()) {
                String strH = cVarB.H(descriptor2, 0);
                String strH2 = cVarB.H(descriptor2, 1);
                String strH3 = cVarB.H(descriptor2, 2);
                v2 v2Var = v2.f53598a;
                objE5 = cVarB.e(descriptor2, 3, v2Var, null);
                String strH4 = cVarB.H(descriptor2, 4);
                int iS = cVarB.s(descriptor2, 5);
                int iS2 = cVarB.s(descriptor2, 6);
                objE4 = cVarB.e(descriptor2, 7, v2Var, null);
                objE3 = cVarB.e(descriptor2, 8, v2Var, null);
                objE = cVarB.e(descriptor2, 9, u0.f53588a, null);
                objE2 = cVarB.e(descriptor2, 10, VungleExt.a.INSTANCE, null);
                str = strH;
                i10 = iS2;
                i11 = iS;
                str4 = strH4;
                str3 = strH3;
                str2 = strH2;
                i12 = 2047;
            } else {
                boolean z10 = true;
                int iS3 = 0;
                int i15 = 0;
                Object objE6 = null;
                Object objE7 = null;
                Object objE8 = null;
                Object objE9 = null;
                String strH5 = null;
                String strH6 = null;
                String strH7 = null;
                String strH8 = null;
                int iS4 = 0;
                Object objE10 = null;
                while (z10) {
                    int iO = cVarB.o(descriptor2);
                    switch (iO) {
                        case -1:
                            z10 = false;
                            i13 = 10;
                            break;
                        case 0:
                            strH5 = cVarB.H(descriptor2, 0);
                            i15 |= 1;
                            i13 = 10;
                            i14 = 9;
                            break;
                        case 1:
                            strH6 = cVarB.H(descriptor2, 1);
                            i15 |= 2;
                            i13 = 10;
                            i14 = 9;
                            break;
                        case 2:
                            strH7 = cVarB.H(descriptor2, 2);
                            i15 |= 4;
                            i13 = 10;
                            i14 = 9;
                            break;
                        case 3:
                            objE10 = cVarB.e(descriptor2, 3, v2.f53598a, objE10);
                            i15 |= 8;
                            i13 = 10;
                            i14 = 9;
                            break;
                        case 4:
                            strH8 = cVarB.H(descriptor2, 4);
                            i15 |= 16;
                            i13 = 10;
                            break;
                        case 5:
                            iS4 = cVarB.s(descriptor2, 5);
                            i15 |= 32;
                            break;
                        case 6:
                            iS3 = cVarB.s(descriptor2, 6);
                            i15 |= 64;
                            break;
                        case 7:
                            objE9 = cVarB.e(descriptor2, 7, v2.f53598a, objE9);
                            i15 |= 128;
                            break;
                        case 8:
                            objE8 = cVarB.e(descriptor2, 8, v2.f53598a, objE8);
                            i15 |= 256;
                            break;
                        case 9:
                            objE6 = cVarB.e(descriptor2, i14, u0.f53588a, objE6);
                            i15 |= 512;
                            break;
                        case 10:
                            objE7 = cVarB.e(descriptor2, i13, VungleExt.a.INSTANCE, objE7);
                            i15 |= UserVerificationMethods.USER_VERIFY_ALL;
                            break;
                        default:
                            throw new UnknownFieldException(iO);
                    }
                }
                i10 = iS3;
                objE = objE6;
                objE2 = objE7;
                objE3 = objE8;
                objE4 = objE9;
                objE5 = objE10;
                i11 = iS4;
                i12 = i15;
                str = strH5;
                str2 = strH6;
                str3 = strH7;
                str4 = strH8;
            }
            cVarB.d(descriptor2);
            return new DeviceNode(i12, str, str2, str3, (String) objE5, str4, i11, i10, (String) objE4, (String) objE3, (Integer) objE, (VungleExt) objE2, (q2) null);
        }

        @Override // pm.d, pm.l, pm.c
        public rm.f getDescriptor() {
            return descriptor;
        }

        @Override // pm.l
        public void serialize(sm.f encoder, DeviceNode value) {
            s.h(encoder, "encoder");
            s.h(value, "value");
            rm.f descriptor2 = getDescriptor();
            sm.d dVarB = encoder.b(descriptor2);
            DeviceNode.write$Self(value, dVarB, descriptor2);
            dVarB.d(descriptor2);
        }

        @Override // tm.l0
        public pm.d[] typeParametersSerializers() {
            return l0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.h$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final pm.d serializer() {
            return a.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.h$c, reason: from toString */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\by\b\u0087\b\u0018\u0000 \u009f\u00012\u00020\u0001:\u0004 \u0001¡\u0001B\u008b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u001fB\u009f\u0002\b\u0017\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0011\u001a\u00020\b\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J(\u0010*\u001a\u00020)2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'HÇ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b4\u0010/J\u0010\u00105\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b7\u0010/J\u0012\u00108\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b8\u0010/J\u0012\u00109\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b9\u0010/J\u0012\u0010:\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b:\u0010/J\u0012\u0010;\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b;\u0010/J\u0010\u0010<\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b<\u00103J\u0010\u0010=\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b=\u00106J\u0010\u0010>\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b>\u0010-J\u0010\u0010?\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b?\u00106J\u0010\u0010@\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b@\u0010-J\u0012\u0010A\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bA\u0010/J\u0012\u0010B\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bB\u0010/J\u0012\u0010C\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bE\u0010DJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bF\u0010DJ\u0012\u0010G\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bG\u0010DJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bH\u0010/J\u0094\u0002\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bK\u0010/J\u0010\u0010L\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bL\u00106J\u001a\u0010N\u001a\u00020\u00022\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bN\u0010OR(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010P\u0012\u0004\bS\u0010T\u001a\u0004\b\u0003\u0010-\"\u0004\bQ\u0010RR*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010U\u0012\u0004\bY\u0010T\u001a\u0004\bV\u0010/\"\u0004\bW\u0010XR*\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010Z\u0012\u0004\b^\u0010T\u001a\u0004\b[\u00101\"\u0004\b\\\u0010]R(\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010_\u0012\u0004\bc\u0010T\u001a\u0004\b`\u00103\"\u0004\ba\u0010bR*\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010U\u0012\u0004\bf\u0010T\u001a\u0004\bd\u0010/\"\u0004\be\u0010XR(\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010g\u0012\u0004\bk\u0010T\u001a\u0004\bh\u00106\"\u0004\bi\u0010jR*\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\f\u0010U\u0012\u0004\bn\u0010T\u001a\u0004\bl\u0010/\"\u0004\bm\u0010XR*\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010U\u0012\u0004\bq\u0010T\u001a\u0004\bo\u0010/\"\u0004\bp\u0010XR*\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010U\u0012\u0004\bt\u0010T\u001a\u0004\br\u0010/\"\u0004\bs\u0010XR*\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010U\u0012\u0004\bw\u0010T\u001a\u0004\bu\u0010/\"\u0004\bv\u0010XR*\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0010\u0010U\u0012\u0004\bz\u0010T\u001a\u0004\bx\u0010/\"\u0004\by\u0010XR(\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010_\u0012\u0004\b}\u0010T\u001a\u0004\b{\u00103\"\u0004\b|\u0010bR)\u0010\u0012\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0019\n\u0004\b\u0012\u0010g\u0012\u0005\b\u0080\u0001\u0010T\u001a\u0004\b~\u00106\"\u0004\b\u007f\u0010jR*\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001a\n\u0004\b\u0013\u0010P\u0012\u0005\b\u0082\u0001\u0010T\u001a\u0004\b\u0013\u0010-\"\u0005\b\u0081\u0001\u0010RR+\u0010\u0014\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b\u0014\u0010g\u0012\u0005\b\u0085\u0001\u0010T\u001a\u0005\b\u0083\u0001\u00106\"\u0005\b\u0084\u0001\u0010jR*\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001a\n\u0004\b\u0015\u0010P\u0012\u0005\b\u0087\u0001\u0010T\u001a\u0004\b\u0015\u0010-\"\u0005\b\u0086\u0001\u0010RR-\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b\u0016\u0010U\u0012\u0005\b\u008a\u0001\u0010T\u001a\u0005\b\u0088\u0001\u0010/\"\u0005\b\u0089\u0001\u0010XR-\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b\u0017\u0010U\u0012\u0005\b\u008d\u0001\u0010T\u001a\u0005\b\u008b\u0001\u0010/\"\u0005\b\u008c\u0001\u0010XR/\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b\u0019\u0010\u008e\u0001\u0012\u0005\b\u0092\u0001\u0010T\u001a\u0005\b\u008f\u0001\u0010D\"\u0006\b\u0090\u0001\u0010\u0091\u0001R/\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b\u001a\u0010\u008e\u0001\u0012\u0005\b\u0095\u0001\u0010T\u001a\u0005\b\u0093\u0001\u0010D\"\u0006\b\u0094\u0001\u0010\u0091\u0001R/\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b\u001b\u0010\u008e\u0001\u0012\u0005\b\u0098\u0001\u0010T\u001a\u0005\b\u0096\u0001\u0010D\"\u0006\b\u0097\u0001\u0010\u0091\u0001R/\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b\u001c\u0010\u008e\u0001\u0012\u0005\b\u009b\u0001\u0010T\u001a\u0005\b\u0099\u0001\u0010D\"\u0006\b\u009a\u0001\u0010\u0091\u0001R-\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u001b\n\u0004\b\u001d\u0010U\u0012\u0005\b\u009e\u0001\u0010T\u001a\u0005\b\u009c\u0001\u0010/\"\u0005\b\u009d\u0001\u0010X¨\u0006¢\u0001"}, d2 = {"Lcom/vungle/ads/internal/model/h$c;", "", "", "isGooglePlayServicesAvailable", "", "appSetId", "", "appSetIdScope", "", "batteryLevel", "batteryState", "batterySaverEnabled", "connectionType", "connectionTypeDetail", "locale", "language", "timeZone", "volumeLevel", "soundEnabled", "isTv", "sdCardAvailable", "isSideloadEnabled", "gaid", "amazonAdvertisingId", "", "sit", "oit", "ort", "obt", "gpVersion", "<init>", "(ZLjava/lang/String;Ljava/lang/Integer;FLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(IZLjava/lang/String;Ljava/lang/Integer;FLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ltm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/h$c;Lsm/d;Lrm/f;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "()F", "component5", "component6", "()I", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "()Ljava/lang/Long;", "component20", "component21", "component22", "component23", "copy", "(ZLjava/lang/String;Ljava/lang/Integer;FLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/vungle/ads/internal/model/h$c;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "setGooglePlayServicesAvailable", "(Z)V", "isGooglePlayServicesAvailable$annotations", "()V", "Ljava/lang/String;", "getAppSetId", "setAppSetId", "(Ljava/lang/String;)V", "getAppSetId$annotations", "Ljava/lang/Integer;", "getAppSetIdScope", "setAppSetIdScope", "(Ljava/lang/Integer;)V", "getAppSetIdScope$annotations", "F", "getBatteryLevel", "setBatteryLevel", "(F)V", "getBatteryLevel$annotations", "getBatteryState", "setBatteryState", "getBatteryState$annotations", "I", "getBatterySaverEnabled", "setBatterySaverEnabled", "(I)V", "getBatterySaverEnabled$annotations", "getConnectionType", "setConnectionType", "getConnectionType$annotations", "getConnectionTypeDetail", "setConnectionTypeDetail", "getConnectionTypeDetail$annotations", "getLocale", "setLocale", "getLocale$annotations", "getLanguage", "setLanguage", "getLanguage$annotations", "getTimeZone", "setTimeZone", "getTimeZone$annotations", "getVolumeLevel", "setVolumeLevel", "getVolumeLevel$annotations", "getSoundEnabled", "setSoundEnabled", "getSoundEnabled$annotations", "setTv", "isTv$annotations", "getSdCardAvailable", "setSdCardAvailable", "getSdCardAvailable$annotations", "setSideloadEnabled", "isSideloadEnabled$annotations", "getGaid", "setGaid", "getGaid$annotations", "getAmazonAdvertisingId", "setAmazonAdvertisingId", "getAmazonAdvertisingId$annotations", "Ljava/lang/Long;", "getSit", "setSit", "(Ljava/lang/Long;)V", "getSit$annotations", "getOit", "setOit", "getOit$annotations", "getOrt", "setOrt", "getOrt$annotations", "getObt", "setObt", "getObt$annotations", "getGpVersion", "setGpVersion", "getGpVersion$annotations", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @pm.k
    public static final /* data */ class VungleExt {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private String amazonAdvertisingId;
        private String appSetId;
        private Integer appSetIdScope;
        private float batteryLevel;
        private int batterySaverEnabled;
        private String batteryState;
        private String connectionType;
        private String connectionTypeDetail;
        private String gaid;
        private String gpVersion;
        private boolean isGooglePlayServicesAvailable;
        private boolean isSideloadEnabled;
        private boolean isTv;
        private String language;
        private String locale;
        private Long obt;
        private Long oit;
        private Long ort;
        private int sdCardAvailable;
        private Long sit;
        private int soundEnabled;
        private String timeZone;
        private float volumeLevel;

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.h$c$a */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        /* JADX INFO: loaded from: classes2.dex */
        public static final class a implements l0 {
            public static final a INSTANCE;
            public static final /* synthetic */ rm.f descriptor;

            private a() {
            }

            @Override // tm.l0
            public pm.d[] childSerializers() {
                v2 v2Var = v2.f53598a;
                pm.d dVarT = qm.a.t(v2Var);
                u0 u0Var = u0.f53588a;
                pm.d dVarT2 = qm.a.t(u0Var);
                pm.d dVarT3 = qm.a.t(v2Var);
                pm.d dVarT4 = qm.a.t(v2Var);
                pm.d dVarT5 = qm.a.t(v2Var);
                pm.d dVarT6 = qm.a.t(v2Var);
                pm.d dVarT7 = qm.a.t(v2Var);
                pm.d dVarT8 = qm.a.t(v2Var);
                pm.d dVarT9 = qm.a.t(v2Var);
                pm.d dVarT10 = qm.a.t(v2Var);
                f1 f1Var = f1.f53474a;
                pm.d dVarT11 = qm.a.t(f1Var);
                pm.d dVarT12 = qm.a.t(f1Var);
                pm.d dVarT13 = qm.a.t(f1Var);
                pm.d dVarT14 = qm.a.t(f1Var);
                pm.d dVarT15 = qm.a.t(v2Var);
                tm.i iVar = tm.i.f53507a;
                k0 k0Var = k0.f53526a;
                return new pm.d[]{iVar, dVarT, dVarT2, k0Var, dVarT3, u0Var, dVarT4, dVarT5, dVarT6, dVarT7, dVarT8, k0Var, u0Var, iVar, u0Var, iVar, dVarT9, dVarT10, dVarT11, dVarT12, dVarT13, dVarT14, dVarT15};
            }

            @Override // pm.c
            public VungleExt deserialize(sm.e decoder) {
                Object objE;
                Object objE2;
                Object objE3;
                Object obj;
                Object obj2;
                int i10;
                Object obj3;
                Object objE4;
                Object objE5;
                Object objE6;
                Object objE7;
                boolean z10;
                float f10;
                Object objE8;
                Object objE9;
                int i11;
                boolean z11;
                boolean z12;
                int i12;
                int i13;
                float f11;
                Object objE10;
                Object objE11;
                Object objE12;
                int i14;
                s.h(decoder, "decoder");
                rm.f descriptor2 = getDescriptor();
                sm.c cVarB = decoder.b(descriptor2);
                int i15 = 0;
                if (cVarB.l()) {
                    boolean zX = cVarB.x(descriptor2, 0);
                    v2 v2Var = v2.f53598a;
                    Object objE13 = cVarB.e(descriptor2, 1, v2Var, null);
                    objE12 = cVarB.e(descriptor2, 2, u0.f53588a, null);
                    float fA = cVarB.A(descriptor2, 3);
                    objE8 = cVarB.e(descriptor2, 4, v2Var, null);
                    int iS = cVarB.s(descriptor2, 5);
                    objE10 = cVarB.e(descriptor2, 6, v2Var, null);
                    objE9 = cVarB.e(descriptor2, 7, v2Var, null);
                    objE7 = cVarB.e(descriptor2, 8, v2Var, null);
                    objE6 = cVarB.e(descriptor2, 9, v2Var, null);
                    objE5 = cVarB.e(descriptor2, 10, v2Var, null);
                    float fA2 = cVarB.A(descriptor2, 11);
                    int iS2 = cVarB.s(descriptor2, 12);
                    boolean zX2 = cVarB.x(descriptor2, 13);
                    int iS3 = cVarB.s(descriptor2, 14);
                    boolean zX3 = cVarB.x(descriptor2, 15);
                    obj = objE13;
                    Object objE14 = cVarB.e(descriptor2, 16, v2Var, null);
                    objE4 = cVarB.e(descriptor2, 17, v2Var, null);
                    f1 f1Var = f1.f53474a;
                    Object objE15 = cVarB.e(descriptor2, 18, f1Var, null);
                    Object objE16 = cVarB.e(descriptor2, 19, f1Var, null);
                    objE11 = cVarB.e(descriptor2, 20, f1Var, null);
                    Object objE17 = cVarB.e(descriptor2, 21, f1Var, null);
                    objE3 = cVarB.e(descriptor2, 22, v2Var, null);
                    i10 = 8388607;
                    i11 = iS2;
                    i13 = iS;
                    f11 = fA2;
                    obj3 = objE15;
                    z10 = zX3;
                    i12 = iS3;
                    z12 = zX2;
                    z11 = zX;
                    f10 = fA;
                    objE = objE16;
                    objE2 = objE17;
                    obj2 = objE14;
                } else {
                    objE = null;
                    boolean z13 = true;
                    Object objE18 = null;
                    Object objE19 = null;
                    Object objE20 = null;
                    Object objE21 = null;
                    Object objE22 = null;
                    objE2 = null;
                    Object objE23 = null;
                    Object objE24 = null;
                    Object objE25 = null;
                    Object objE26 = null;
                    Object objE27 = null;
                    Object objE28 = null;
                    Object objE29 = null;
                    boolean zX4 = false;
                    int iS4 = 0;
                    boolean zX5 = false;
                    boolean zX6 = false;
                    int iS5 = 0;
                    int iS6 = 0;
                    float fA3 = 0.0f;
                    float fA4 = 0.0f;
                    Object objE30 = null;
                    while (z13) {
                        Object obj4 = objE22;
                        int iO = cVarB.o(descriptor2);
                        switch (iO) {
                            case -1:
                                z13 = false;
                                objE18 = objE18;
                                objE28 = objE28;
                                objE19 = objE19;
                                objE22 = obj4;
                                break;
                            case 0:
                                zX5 = cVarB.x(descriptor2, 0);
                                i15 |= 1;
                                objE20 = objE20;
                                objE18 = objE18;
                                objE28 = objE28;
                                objE19 = objE19;
                                objE22 = obj4;
                                break;
                            case 1:
                                objE18 = objE18;
                                i15 |= 2;
                                objE19 = objE19;
                                objE29 = objE29;
                                objE22 = obj4;
                                objE20 = objE20;
                                objE28 = cVarB.e(descriptor2, 1, v2.f53598a, objE28);
                                objE18 = objE18;
                                break;
                            case 2:
                                objE29 = cVarB.e(descriptor2, 2, u0.f53588a, objE29);
                                i15 |= 4;
                                objE19 = objE19;
                                objE22 = obj4;
                                objE20 = objE20;
                                objE18 = objE18;
                                break;
                            case 3:
                                fA3 = cVarB.A(descriptor2, 3);
                                i15 |= 8;
                                objE22 = obj4;
                                objE19 = objE19;
                                objE20 = objE20;
                                objE18 = objE18;
                                break;
                            case 4:
                                objE18 = objE18;
                                i15 |= 16;
                                objE19 = objE19;
                                objE20 = objE20;
                                objE22 = cVarB.e(descriptor2, 4, v2.f53598a, obj4);
                                objE18 = objE18;
                                break;
                            case 5:
                                iS6 = cVarB.s(descriptor2, 5);
                                i15 |= 32;
                                objE19 = objE19;
                                objE18 = objE18;
                                objE22 = obj4;
                                break;
                            case 6:
                                objE19 = cVarB.e(descriptor2, 6, v2.f53598a, objE19);
                                i15 |= 64;
                                objE18 = objE18;
                                objE22 = obj4;
                                break;
                            case 7:
                                objE19 = objE19;
                                objE20 = cVarB.e(descriptor2, 7, v2.f53598a, objE20);
                                i15 |= 128;
                                objE22 = obj4;
                                objE19 = objE19;
                                break;
                            case 8:
                                objE19 = objE19;
                                objE27 = cVarB.e(descriptor2, 8, v2.f53598a, objE27);
                                i15 |= 256;
                                objE22 = obj4;
                                objE19 = objE19;
                                break;
                            case 9:
                                objE19 = objE19;
                                objE26 = cVarB.e(descriptor2, 9, v2.f53598a, objE26);
                                i15 |= 512;
                                objE22 = obj4;
                                objE19 = objE19;
                                break;
                            case 10:
                                objE19 = objE19;
                                objE25 = cVarB.e(descriptor2, 10, v2.f53598a, objE25);
                                i15 |= UserVerificationMethods.USER_VERIFY_ALL;
                                objE22 = obj4;
                                objE19 = objE19;
                                break;
                            case 11:
                                objE19 = objE19;
                                fA4 = cVarB.A(descriptor2, 11);
                                i15 |= 2048;
                                objE22 = obj4;
                                objE19 = objE19;
                                break;
                            case 12:
                                objE19 = objE19;
                                iS4 = cVarB.s(descriptor2, 12);
                                i15 |= 4096;
                                objE22 = obj4;
                                objE19 = objE19;
                                break;
                            case 13:
                                objE19 = objE19;
                                zX6 = cVarB.x(descriptor2, 13);
                                i15 |= 8192;
                                objE22 = obj4;
                                objE19 = objE19;
                                break;
                            case 14:
                                objE19 = objE19;
                                iS5 = cVarB.s(descriptor2, 14);
                                i15 |= 16384;
                                objE22 = obj4;
                                objE19 = objE19;
                                break;
                            case 15:
                                objE19 = objE19;
                                zX4 = cVarB.x(descriptor2, 15);
                                i15 |= 32768;
                                objE22 = obj4;
                                objE19 = objE19;
                                break;
                            case 16:
                                objE21 = cVarB.e(descriptor2, 16, v2.f53598a, objE21);
                                i14 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                                i15 |= i14;
                                objE22 = obj4;
                                objE19 = objE19;
                                break;
                            case 17:
                                objE24 = cVarB.e(descriptor2, 17, v2.f53598a, objE24);
                                i14 = 131072;
                                i15 |= i14;
                                objE22 = obj4;
                                objE19 = objE19;
                                break;
                            case 18:
                                objE23 = cVarB.e(descriptor2, 18, f1.f53474a, objE23);
                                i14 = MediaHttpUploader.MINIMUM_CHUNK_SIZE;
                                i15 |= i14;
                                objE22 = obj4;
                                objE19 = objE19;
                                break;
                            case 19:
                                objE = cVarB.e(descriptor2, 19, f1.f53474a, objE);
                                i14 = 524288;
                                i15 |= i14;
                                objE22 = obj4;
                                objE19 = objE19;
                                break;
                            case 20:
                                objE30 = cVarB.e(descriptor2, 20, f1.f53474a, objE30);
                                i14 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                i15 |= i14;
                                objE22 = obj4;
                                objE19 = objE19;
                                break;
                            case 21:
                                objE2 = cVarB.e(descriptor2, 21, f1.f53474a, objE2);
                                i14 = 2097152;
                                i15 |= i14;
                                objE22 = obj4;
                                objE19 = objE19;
                                break;
                            case 22:
                                objE18 = cVarB.e(descriptor2, 22, v2.f53598a, objE18);
                                i14 = 4194304;
                                i15 |= i14;
                                objE22 = obj4;
                                objE19 = objE19;
                                break;
                            default:
                                throw new UnknownFieldException(iO);
                        }
                    }
                    objE3 = objE18;
                    Object obj5 = objE20;
                    Object obj6 = objE22;
                    Object obj7 = objE19;
                    obj = objE28;
                    obj2 = objE21;
                    i10 = i15;
                    obj3 = objE23;
                    objE4 = objE24;
                    objE5 = objE25;
                    objE6 = objE26;
                    objE7 = objE27;
                    z10 = zX4;
                    f10 = fA3;
                    objE8 = obj6;
                    objE9 = obj5;
                    i11 = iS4;
                    z11 = zX5;
                    z12 = zX6;
                    i12 = iS5;
                    i13 = iS6;
                    f11 = fA4;
                    objE10 = obj7;
                    objE11 = objE30;
                    objE12 = objE29;
                }
                cVarB.d(descriptor2);
                return new VungleExt(i10, z11, (String) obj, (Integer) objE12, f10, (String) objE8, i13, (String) objE10, (String) objE9, (String) objE7, (String) objE6, (String) objE5, f11, i11, z12, i12, z10, (String) obj2, (String) objE4, (Long) obj3, (Long) objE, (Long) objE11, (Long) objE2, (String) objE3, (q2) null);
            }

            @Override // pm.d, pm.l, pm.c
            public rm.f getDescriptor() {
                return descriptor;
            }

            @Override // pm.l
            public void serialize(sm.f encoder, VungleExt value) {
                s.h(encoder, "encoder");
                s.h(value, "value");
                rm.f descriptor2 = getDescriptor();
                sm.d dVarB = encoder.b(descriptor2);
                VungleExt.write$Self(value, dVarB, descriptor2);
                dVarB.d(descriptor2);
            }

            @Override // tm.l0
            public pm.d[] typeParametersSerializers() {
                return l0.a.a(this);
            }

            static {
                a aVar = new a();
                INSTANCE = aVar;
                g2 g2Var = new g2("com.vungle.ads.internal.model.DeviceNode.VungleExt", aVar, 23);
                g2Var.p("is_google_play_services_available", true);
                g2Var.p("app_set_id", true);
                g2Var.p("app_set_id_scope", true);
                g2Var.p("battery_level", true);
                g2Var.p("battery_state", true);
                g2Var.p("battery_saver_enabled", true);
                g2Var.p("connection_type", true);
                g2Var.p("connection_type_detail", true);
                g2Var.p("locale", true);
                g2Var.p("language", true);
                g2Var.p(NpmRNZ.SOguAFP, true);
                g2Var.p("volume_level", true);
                g2Var.p("sound_enabled", true);
                g2Var.p("is_tv", true);
                g2Var.p("sd_card_available", true);
                g2Var.p("is_sideload_enabled", true);
                g2Var.p("gaid", true);
                g2Var.p("amazon_advertising_id", true);
                g2Var.p("sit", true);
                g2Var.p("oit", true);
                g2Var.p("ort", true);
                g2Var.p("obt", true);
                g2Var.p("gp_version", true);
                descriptor = g2Var;
            }
        }

        /* JADX INFO: renamed from: com.vungle.ads.internal.model.h$c$b, reason: from kotlin metadata */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final pm.d serializer() {
                return a.INSTANCE;
            }

            private Companion() {
            }
        }

        public VungleExt() {
            this(false, (String) null, (Integer) null, 0.0f, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, false, 0, false, (String) null, (String) null, (Long) null, (Long) null, (Long) null, (Long) null, (String) null, 8388607, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ VungleExt copy$default(VungleExt vungleExt, boolean z10, String str, Integer num, float f10, String str2, int i10, String str3, String str4, String str5, String str6, String str7, float f11, int i11, boolean z11, int i12, boolean z12, String str8, String str9, Long l10, Long l11, Long l12, Long l13, String str10, int i13, Object obj) {
            String str11;
            Long l14;
            boolean z13 = (i13 & 1) != 0 ? vungleExt.isGooglePlayServicesAvailable : z10;
            String str12 = (i13 & 2) != 0 ? vungleExt.appSetId : str;
            Integer num2 = (i13 & 4) != 0 ? vungleExt.appSetIdScope : num;
            float f12 = (i13 & 8) != 0 ? vungleExt.batteryLevel : f10;
            String str13 = (i13 & 16) != 0 ? vungleExt.batteryState : str2;
            int i14 = (i13 & 32) != 0 ? vungleExt.batterySaverEnabled : i10;
            String str14 = (i13 & 64) != 0 ? vungleExt.connectionType : str3;
            String str15 = (i13 & 128) != 0 ? vungleExt.connectionTypeDetail : str4;
            String str16 = (i13 & 256) != 0 ? vungleExt.locale : str5;
            String str17 = (i13 & 512) != 0 ? vungleExt.language : str6;
            String str18 = (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? vungleExt.timeZone : str7;
            float f13 = (i13 & 2048) != 0 ? vungleExt.volumeLevel : f11;
            int i15 = (i13 & 4096) != 0 ? vungleExt.soundEnabled : i11;
            boolean z14 = (i13 & 8192) != 0 ? vungleExt.isTv : z11;
            boolean z15 = z13;
            int i16 = (i13 & 16384) != 0 ? vungleExt.sdCardAvailable : i12;
            boolean z16 = (i13 & 32768) != 0 ? vungleExt.isSideloadEnabled : z12;
            String str19 = (i13 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? vungleExt.gaid : str8;
            String str20 = (i13 & 131072) != 0 ? vungleExt.amazonAdvertisingId : str9;
            Long l15 = (i13 & MediaHttpUploader.MINIMUM_CHUNK_SIZE) != 0 ? vungleExt.sit : l10;
            Long l16 = (i13 & 524288) != 0 ? vungleExt.oit : l11;
            Long l17 = (i13 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? vungleExt.ort : l12;
            Long l18 = (i13 & 2097152) != 0 ? vungleExt.obt : l13;
            if ((i13 & 4194304) != 0) {
                l14 = l18;
                str11 = vungleExt.gpVersion;
            } else {
                str11 = str10;
                l14 = l18;
            }
            return vungleExt.copy(z15, str12, num2, f12, str13, i14, str14, str15, str16, str17, str18, f13, i15, z14, i16, z16, str19, str20, l15, l16, l17, l14, str11);
        }

        public static final void write$Self(VungleExt self, sm.d output, rm.f serialDesc) {
            Float fValueOf = Float.valueOf(0.0f);
            s.h(self, "self");
            s.h(output, "output");
            s.h(serialDesc, "serialDesc");
            if (output.k(serialDesc, 0) || self.isGooglePlayServicesAvailable) {
                output.f(serialDesc, 0, self.isGooglePlayServicesAvailable);
            }
            if (output.k(serialDesc, 1) || self.appSetId != null) {
                output.w(serialDesc, 1, v2.f53598a, self.appSetId);
            }
            if (output.k(serialDesc, 2) || self.appSetIdScope != null) {
                output.w(serialDesc, 2, u0.f53588a, self.appSetIdScope);
            }
            if (output.k(serialDesc, 3) || !s.c(Float.valueOf(self.batteryLevel), fValueOf)) {
                output.n(serialDesc, 3, self.batteryLevel);
            }
            if (output.k(serialDesc, 4) || self.batteryState != null) {
                output.w(serialDesc, 4, v2.f53598a, self.batteryState);
            }
            if (output.k(serialDesc, 5) || self.batterySaverEnabled != 0) {
                output.i(serialDesc, 5, self.batterySaverEnabled);
            }
            if (output.k(serialDesc, 6) || self.connectionType != null) {
                output.w(serialDesc, 6, v2.f53598a, self.connectionType);
            }
            if (output.k(serialDesc, 7) || self.connectionTypeDetail != null) {
                output.w(serialDesc, 7, v2.f53598a, self.connectionTypeDetail);
            }
            if (output.k(serialDesc, 8) || self.locale != null) {
                output.w(serialDesc, 8, v2.f53598a, self.locale);
            }
            if (output.k(serialDesc, 9) || self.language != null) {
                output.w(serialDesc, 9, v2.f53598a, self.language);
            }
            if (output.k(serialDesc, 10) || self.timeZone != null) {
                output.w(serialDesc, 10, v2.f53598a, self.timeZone);
            }
            if (output.k(serialDesc, 11) || !s.c(Float.valueOf(self.volumeLevel), fValueOf)) {
                output.n(serialDesc, 11, self.volumeLevel);
            }
            if (output.k(serialDesc, 12) || self.soundEnabled != 1) {
                output.i(serialDesc, 12, self.soundEnabled);
            }
            if (output.k(serialDesc, 13) || self.isTv) {
                output.f(serialDesc, 13, self.isTv);
            }
            if (output.k(serialDesc, 14) || self.sdCardAvailable != 1) {
                output.i(serialDesc, 14, self.sdCardAvailable);
            }
            if (output.k(serialDesc, 15) || self.isSideloadEnabled) {
                output.f(serialDesc, 15, self.isSideloadEnabled);
            }
            if (output.k(serialDesc, 16) || self.gaid != null) {
                output.w(serialDesc, 16, v2.f53598a, self.gaid);
            }
            if (output.k(serialDesc, 17) || self.amazonAdvertisingId != null) {
                output.w(serialDesc, 17, v2.f53598a, self.amazonAdvertisingId);
            }
            if (output.k(serialDesc, 18) || self.sit != null) {
                output.w(serialDesc, 18, f1.f53474a, self.sit);
            }
            if (output.k(serialDesc, 19) || self.oit != null) {
                output.w(serialDesc, 19, f1.f53474a, self.oit);
            }
            if (output.k(serialDesc, 20) || self.ort != null) {
                output.w(serialDesc, 20, f1.f53474a, self.ort);
            }
            if (output.k(serialDesc, 21) || self.obt != null) {
                output.w(serialDesc, 21, f1.f53474a, self.obt);
            }
            if (!output.k(serialDesc, 22) && self.gpVersion == null) {
                return;
            }
            output.w(serialDesc, 22, v2.f53598a, self.gpVersion);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsGooglePlayServicesAvailable() {
            return this.isGooglePlayServicesAvailable;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getLanguage() {
            return this.language;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getTimeZone() {
            return this.timeZone;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final float getVolumeLevel() {
            return this.volumeLevel;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final int getSoundEnabled() {
            return this.soundEnabled;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final boolean getIsTv() {
            return this.isTv;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final int getSdCardAvailable() {
            return this.sdCardAvailable;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        public final boolean getIsSideloadEnabled() {
            return this.isSideloadEnabled;
        }

        /* JADX INFO: renamed from: component17, reason: from getter */
        public final String getGaid() {
            return this.gaid;
        }

        /* JADX INFO: renamed from: component18, reason: from getter */
        public final String getAmazonAdvertisingId() {
            return this.amazonAdvertisingId;
        }

        /* JADX INFO: renamed from: component19, reason: from getter */
        public final Long getSit() {
            return this.sit;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAppSetId() {
            return this.appSetId;
        }

        /* JADX INFO: renamed from: component20, reason: from getter */
        public final Long getOit() {
            return this.oit;
        }

        /* JADX INFO: renamed from: component21, reason: from getter */
        public final Long getOrt() {
            return this.ort;
        }

        /* JADX INFO: renamed from: component22, reason: from getter */
        public final Long getObt() {
            return this.obt;
        }

        /* JADX INFO: renamed from: component23, reason: from getter */
        public final String getGpVersion() {
            return this.gpVersion;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getAppSetIdScope() {
            return this.appSetIdScope;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final float getBatteryLevel() {
            return this.batteryLevel;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getBatteryState() {
            return this.batteryState;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getBatterySaverEnabled() {
            return this.batterySaverEnabled;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getConnectionType() {
            return this.connectionType;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getConnectionTypeDetail() {
            return this.connectionTypeDetail;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getLocale() {
            return this.locale;
        }

        public final VungleExt copy(boolean isGooglePlayServicesAvailable, String appSetId, Integer appSetIdScope, float batteryLevel, String batteryState, int batterySaverEnabled, String connectionType, String connectionTypeDetail, String locale, String language, String timeZone, float volumeLevel, int soundEnabled, boolean isTv, int sdCardAvailable, boolean isSideloadEnabled, String gaid, String amazonAdvertisingId, Long sit, Long oit, Long ort, Long obt, String gpVersion) {
            return new VungleExt(isGooglePlayServicesAvailable, appSetId, appSetIdScope, batteryLevel, batteryState, batterySaverEnabled, connectionType, connectionTypeDetail, locale, language, timeZone, volumeLevel, soundEnabled, isTv, sdCardAvailable, isSideloadEnabled, gaid, amazonAdvertisingId, sit, oit, ort, obt, gpVersion);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VungleExt)) {
                return false;
            }
            VungleExt vungleExt = (VungleExt) other;
            return this.isGooglePlayServicesAvailable == vungleExt.isGooglePlayServicesAvailable && s.c(this.appSetId, vungleExt.appSetId) && s.c(this.appSetIdScope, vungleExt.appSetIdScope) && s.c(Float.valueOf(this.batteryLevel), Float.valueOf(vungleExt.batteryLevel)) && s.c(this.batteryState, vungleExt.batteryState) && this.batterySaverEnabled == vungleExt.batterySaverEnabled && s.c(this.connectionType, vungleExt.connectionType) && s.c(this.connectionTypeDetail, vungleExt.connectionTypeDetail) && s.c(this.locale, vungleExt.locale) && s.c(this.language, vungleExt.language) && s.c(this.timeZone, vungleExt.timeZone) && s.c(Float.valueOf(this.volumeLevel), Float.valueOf(vungleExt.volumeLevel)) && this.soundEnabled == vungleExt.soundEnabled && this.isTv == vungleExt.isTv && this.sdCardAvailable == vungleExt.sdCardAvailable && this.isSideloadEnabled == vungleExt.isSideloadEnabled && s.c(this.gaid, vungleExt.gaid) && s.c(this.amazonAdvertisingId, vungleExt.amazonAdvertisingId) && s.c(this.sit, vungleExt.sit) && s.c(this.oit, vungleExt.oit) && s.c(this.ort, vungleExt.ort) && s.c(this.obt, vungleExt.obt) && s.c(this.gpVersion, vungleExt.gpVersion);
        }

        public final String getAmazonAdvertisingId() {
            return this.amazonAdvertisingId;
        }

        public final String getAppSetId() {
            return this.appSetId;
        }

        public final Integer getAppSetIdScope() {
            return this.appSetIdScope;
        }

        public final float getBatteryLevel() {
            return this.batteryLevel;
        }

        public final int getBatterySaverEnabled() {
            return this.batterySaverEnabled;
        }

        public final String getBatteryState() {
            return this.batteryState;
        }

        public final String getConnectionType() {
            return this.connectionType;
        }

        public final String getConnectionTypeDetail() {
            return this.connectionTypeDetail;
        }

        public final String getGaid() {
            return this.gaid;
        }

        public final String getGpVersion() {
            return this.gpVersion;
        }

        public final String getLanguage() {
            return this.language;
        }

        public final String getLocale() {
            return this.locale;
        }

        public final Long getObt() {
            return this.obt;
        }

        public final Long getOit() {
            return this.oit;
        }

        public final Long getOrt() {
            return this.ort;
        }

        public final int getSdCardAvailable() {
            return this.sdCardAvailable;
        }

        public final Long getSit() {
            return this.sit;
        }

        public final int getSoundEnabled() {
            return this.soundEnabled;
        }

        public final String getTimeZone() {
            return this.timeZone;
        }

        public final float getVolumeLevel() {
            return this.volumeLevel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v27, types: [int] */
        /* JADX WARN: Type inference failed for: r0v46 */
        /* JADX WARN: Type inference failed for: r0v47 */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v27 */
        /* JADX WARN: Type inference failed for: r2v33, types: [int] */
        /* JADX WARN: Type inference failed for: r2v37 */
        /* JADX WARN: Type inference failed for: r2v46 */
        public int hashCode() {
            boolean z10 = this.isGooglePlayServicesAvailable;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            int i10 = r10 * 31;
            String str = this.appSetId;
            int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.appSetIdScope;
            int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Float.hashCode(this.batteryLevel)) * 31;
            String str2 = this.batteryState;
            int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.batterySaverEnabled)) * 31;
            String str3 = this.connectionType;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.connectionTypeDetail;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.locale;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.language;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.timeZone;
            int iHashCode8 = (((((iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + Float.hashCode(this.volumeLevel)) * 31) + Integer.hashCode(this.soundEnabled)) * 31;
            boolean z11 = this.isTv;
            ?? r11 = z11;
            if (z11) {
                r11 = 1;
            }
            int iHashCode9 = (((iHashCode8 + r11) * 31) + Integer.hashCode(this.sdCardAvailable)) * 31;
            boolean z12 = this.isSideloadEnabled;
            int i11 = (iHashCode9 + (z12 ? 1 : z12)) * 31;
            String str8 = this.gaid;
            int iHashCode10 = (i11 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.amazonAdvertisingId;
            int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Long l10 = this.sit;
            int iHashCode12 = (iHashCode11 + (l10 == null ? 0 : l10.hashCode())) * 31;
            Long l11 = this.oit;
            int iHashCode13 = (iHashCode12 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Long l12 = this.ort;
            int iHashCode14 = (iHashCode13 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.obt;
            int iHashCode15 = (iHashCode14 + (l13 == null ? 0 : l13.hashCode())) * 31;
            String str10 = this.gpVersion;
            return iHashCode15 + (str10 != null ? str10.hashCode() : 0);
        }

        public final boolean isGooglePlayServicesAvailable() {
            return this.isGooglePlayServicesAvailable;
        }

        public final boolean isSideloadEnabled() {
            return this.isSideloadEnabled;
        }

        public final boolean isTv() {
            return this.isTv;
        }

        public final void setAmazonAdvertisingId(String str) {
            this.amazonAdvertisingId = str;
        }

        public final void setAppSetId(String str) {
            this.appSetId = str;
        }

        public final void setAppSetIdScope(Integer num) {
            this.appSetIdScope = num;
        }

        public final void setBatteryLevel(float f10) {
            this.batteryLevel = f10;
        }

        public final void setBatterySaverEnabled(int i10) {
            this.batterySaverEnabled = i10;
        }

        public final void setBatteryState(String str) {
            this.batteryState = str;
        }

        public final void setConnectionType(String str) {
            this.connectionType = str;
        }

        public final void setConnectionTypeDetail(String str) {
            this.connectionTypeDetail = str;
        }

        public final void setGaid(String str) {
            this.gaid = str;
        }

        public final void setGooglePlayServicesAvailable(boolean z10) {
            this.isGooglePlayServicesAvailable = z10;
        }

        public final void setGpVersion(String str) {
            this.gpVersion = str;
        }

        public final void setLanguage(String str) {
            this.language = str;
        }

        public final void setLocale(String str) {
            this.locale = str;
        }

        public final void setObt(Long l10) {
            this.obt = l10;
        }

        public final void setOit(Long l10) {
            this.oit = l10;
        }

        public final void setOrt(Long l10) {
            this.ort = l10;
        }

        public final void setSdCardAvailable(int i10) {
            this.sdCardAvailable = i10;
        }

        public final void setSideloadEnabled(boolean z10) {
            this.isSideloadEnabled = z10;
        }

        public final void setSit(Long l10) {
            this.sit = l10;
        }

        public final void setSoundEnabled(int i10) {
            this.soundEnabled = i10;
        }

        public final void setTimeZone(String str) {
            this.timeZone = str;
        }

        public final void setTv(boolean z10) {
            this.isTv = z10;
        }

        public final void setVolumeLevel(float f10) {
            this.volumeLevel = f10;
        }

        public String toString() {
            return "VungleExt(isGooglePlayServicesAvailable=" + this.isGooglePlayServicesAvailable + ", appSetId=" + this.appSetId + ", appSetIdScope=" + this.appSetIdScope + ", batteryLevel=" + this.batteryLevel + ", batteryState=" + this.batteryState + ", batterySaverEnabled=" + this.batterySaverEnabled + ", connectionType=" + this.connectionType + ", connectionTypeDetail=" + this.connectionTypeDetail + ", locale=" + this.locale + ", language=" + this.language + ", timeZone=" + this.timeZone + ", volumeLevel=" + this.volumeLevel + ", soundEnabled=" + this.soundEnabled + ", isTv=" + this.isTv + ", sdCardAvailable=" + this.sdCardAvailable + ", isSideloadEnabled=" + this.isSideloadEnabled + ", gaid=" + this.gaid + ", amazonAdvertisingId=" + this.amazonAdvertisingId + ", sit=" + this.sit + ", oit=" + this.oit + ", ort=" + this.ort + ", obt=" + this.obt + ", gpVersion=" + this.gpVersion + ')';
        }

        public /* synthetic */ VungleExt(int i10, boolean z10, String str, Integer num, float f10, String str2, int i11, String str3, String str4, String str5, String str6, String str7, float f11, int i12, boolean z11, int i13, boolean z12, String str8, String str9, Long l10, Long l11, Long l12, Long l13, String str10, q2 q2Var) {
            if ((i10 & 1) == 0) {
                this.isGooglePlayServicesAvailable = false;
            } else {
                this.isGooglePlayServicesAvailable = z10;
            }
            if ((i10 & 2) == 0) {
                this.appSetId = null;
            } else {
                this.appSetId = str;
            }
            if ((i10 & 4) == 0) {
                this.appSetIdScope = null;
            } else {
                this.appSetIdScope = num;
            }
            if ((i10 & 8) == 0) {
                this.batteryLevel = 0.0f;
            } else {
                this.batteryLevel = f10;
            }
            if ((i10 & 16) == 0) {
                this.batteryState = null;
            } else {
                this.batteryState = str2;
            }
            if ((i10 & 32) == 0) {
                this.batterySaverEnabled = 0;
            } else {
                this.batterySaverEnabled = i11;
            }
            if ((i10 & 64) == 0) {
                this.connectionType = null;
            } else {
                this.connectionType = str3;
            }
            if ((i10 & 128) == 0) {
                this.connectionTypeDetail = null;
            } else {
                this.connectionTypeDetail = str4;
            }
            if ((i10 & 256) == 0) {
                this.locale = null;
            } else {
                this.locale = str5;
            }
            if ((i10 & 512) == 0) {
                this.language = null;
            } else {
                this.language = str6;
            }
            if ((i10 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                this.timeZone = null;
            } else {
                this.timeZone = str7;
            }
            if ((i10 & 2048) == 0) {
                this.volumeLevel = 0.0f;
            } else {
                this.volumeLevel = f11;
            }
            if ((i10 & 4096) == 0) {
                this.soundEnabled = 1;
            } else {
                this.soundEnabled = i12;
            }
            if ((i10 & 8192) == 0) {
                this.isTv = false;
            } else {
                this.isTv = z11;
            }
            if ((i10 & 16384) == 0) {
                this.sdCardAvailable = 1;
            } else {
                this.sdCardAvailable = i13;
            }
            if ((32768 & i10) == 0) {
                this.isSideloadEnabled = false;
            } else {
                this.isSideloadEnabled = z12;
            }
            if ((65536 & i10) == 0) {
                this.gaid = null;
            } else {
                this.gaid = str8;
            }
            if ((131072 & i10) == 0) {
                this.amazonAdvertisingId = null;
            } else {
                this.amazonAdvertisingId = str9;
            }
            if ((262144 & i10) == 0) {
                this.sit = null;
            } else {
                this.sit = l10;
            }
            if ((524288 & i10) == 0) {
                this.oit = null;
            } else {
                this.oit = l11;
            }
            if ((1048576 & i10) == 0) {
                this.ort = null;
            } else {
                this.ort = l12;
            }
            if ((2097152 & i10) == 0) {
                this.obt = null;
            } else {
                this.obt = l13;
            }
            if ((i10 & 4194304) == 0) {
                this.gpVersion = null;
            } else {
                this.gpVersion = str10;
            }
        }

        public VungleExt(boolean z10, String str, Integer num, float f10, String str2, int i10, String str3, String str4, String str5, String str6, String str7, float f11, int i11, boolean z11, int i12, boolean z12, String str8, String str9, Long l10, Long l11, Long l12, Long l13, String str10) {
            this.isGooglePlayServicesAvailable = z10;
            this.appSetId = str;
            this.appSetIdScope = num;
            this.batteryLevel = f10;
            this.batteryState = str2;
            this.batterySaverEnabled = i10;
            this.connectionType = str3;
            this.connectionTypeDetail = str4;
            this.locale = str5;
            this.language = str6;
            this.timeZone = str7;
            this.volumeLevel = f11;
            this.soundEnabled = i11;
            this.isTv = z11;
            this.sdCardAvailable = i12;
            this.isSideloadEnabled = z12;
            this.gaid = str8;
            this.amazonAdvertisingId = str9;
            this.sit = l10;
            this.oit = l11;
            this.ort = l12;
            this.obt = l13;
            this.gpVersion = str10;
        }

        public static /* synthetic */ void getAmazonAdvertisingId$annotations() {
        }

        public static /* synthetic */ void getAppSetId$annotations() {
        }

        public static /* synthetic */ void getAppSetIdScope$annotations() {
        }

        public static /* synthetic */ void getBatteryLevel$annotations() {
        }

        public static /* synthetic */ void getBatterySaverEnabled$annotations() {
        }

        public static /* synthetic */ void getBatteryState$annotations() {
        }

        public static /* synthetic */ void getConnectionType$annotations() {
        }

        public static /* synthetic */ void getConnectionTypeDetail$annotations() {
        }

        public static /* synthetic */ void getGaid$annotations() {
        }

        public static /* synthetic */ void getGpVersion$annotations() {
        }

        public static /* synthetic */ void getLanguage$annotations() {
        }

        public static /* synthetic */ void getLocale$annotations() {
        }

        public static /* synthetic */ void getObt$annotations() {
        }

        public static /* synthetic */ void getOit$annotations() {
        }

        public static /* synthetic */ void getOrt$annotations() {
        }

        public static /* synthetic */ void getSdCardAvailable$annotations() {
        }

        public static /* synthetic */ void getSit$annotations() {
        }

        public static /* synthetic */ void getSoundEnabled$annotations() {
        }

        public static /* synthetic */ void getTimeZone$annotations() {
        }

        public static /* synthetic */ void getVolumeLevel$annotations() {
        }

        public static /* synthetic */ void isGooglePlayServicesAvailable$annotations() {
        }

        public static /* synthetic */ void isSideloadEnabled$annotations() {
        }

        public static /* synthetic */ void isTv$annotations() {
        }

        public /* synthetic */ VungleExt(boolean z10, String str, Integer num, float f10, String str2, int i10, String str3, String str4, String str5, String str6, String str7, float f11, int i11, boolean z11, int i12, boolean z12, String str8, String str9, Long l10, Long l11, Long l12, Long l13, String str10, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : num, (i13 & 8) != 0 ? 0.0f : f10, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? 0 : i10, (i13 & 64) != 0 ? null : str3, (i13 & 128) != 0 ? null : str4, (i13 & 256) != 0 ? null : str5, (i13 & 512) != 0 ? null : str6, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str7, (i13 & 2048) == 0 ? f11 : 0.0f, (i13 & 4096) != 0 ? 1 : i11, (i13 & 8192) != 0 ? false : z11, (i13 & 16384) == 0 ? i12 : 1, (32768 & i13) != 0 ? false : z12, (i13 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : str8, (i13 & 131072) != 0 ? null : str9, (i13 & MediaHttpUploader.MINIMUM_CHUNK_SIZE) != 0 ? null : l10, (i13 & 524288) != 0 ? null : l11, (i13 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : l12, (i13 & 2097152) != 0 ? null : l13, (i13 & 4194304) != 0 ? null : str10);
        }
    }

    public /* synthetic */ DeviceNode(int i10, String str, String str2, String str3, String str4, String str5, int i11, int i12, String str6, String str7, Integer num, VungleExt vungleExt, q2 q2Var) {
        if (119 != (i10 & Sdk$SDKError.b.JSON_ENCODE_ERROR_VALUE)) {
            b2.a(i10, Sdk$SDKError.b.JSON_ENCODE_ERROR_VALUE, a.INSTANCE.getDescriptor());
        }
        this.make = str;
        this.model = str2;
        this.osv = str3;
        if ((i10 & 8) == 0) {
            this.carrier = null;
        } else {
            this.carrier = str4;
        }
        this.os = str5;
        this.w = i11;
        this.h = i12;
        if ((i10 & 128) == 0) {
            this.ua = null;
        } else {
            this.ua = str6;
        }
        if ((i10 & 256) == 0) {
            this.ifa = null;
        } else {
            this.ifa = str7;
        }
        if ((i10 & 512) == 0) {
            this.lmt = null;
        } else {
            this.lmt = num;
        }
        if ((i10 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
            this.ext = null;
        } else {
            this.ext = vungleExt;
        }
    }

    public static /* synthetic */ DeviceNode copy$default(DeviceNode deviceNode, String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, String str7, Integer num, VungleExt vungleExt, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = deviceNode.make;
        }
        if ((i12 & 2) != 0) {
            str2 = deviceNode.model;
        }
        if ((i12 & 4) != 0) {
            str3 = deviceNode.osv;
        }
        if ((i12 & 8) != 0) {
            str4 = deviceNode.carrier;
        }
        if ((i12 & 16) != 0) {
            str5 = deviceNode.os;
        }
        if ((i12 & 32) != 0) {
            i10 = deviceNode.w;
        }
        if ((i12 & 64) != 0) {
            i11 = deviceNode.h;
        }
        if ((i12 & 128) != 0) {
            str6 = deviceNode.ua;
        }
        if ((i12 & 256) != 0) {
            str7 = deviceNode.ifa;
        }
        if ((i12 & 512) != 0) {
            num = deviceNode.lmt;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            vungleExt = deviceNode.ext;
        }
        Integer num2 = num;
        VungleExt vungleExt2 = vungleExt;
        String str8 = str6;
        String str9 = str7;
        int i13 = i10;
        int i14 = i11;
        String str10 = str5;
        String str11 = str3;
        return deviceNode.copy(str, str2, str11, str4, str10, i13, i14, str8, str9, num2, vungleExt2);
    }

    public static final void write$Self(DeviceNode self, sm.d output, rm.f serialDesc) {
        s.h(self, "self");
        s.h(output, "output");
        s.h(serialDesc, "serialDesc");
        output.F(serialDesc, 0, self.make);
        output.F(serialDesc, 1, self.model);
        output.F(serialDesc, 2, self.osv);
        if (output.k(serialDesc, 3) || self.carrier != null) {
            output.w(serialDesc, 3, v2.f53598a, self.carrier);
        }
        output.F(serialDesc, 4, self.os);
        output.i(serialDesc, 5, self.w);
        output.i(serialDesc, 6, self.h);
        if (output.k(serialDesc, 7) || self.ua != null) {
            output.w(serialDesc, 7, v2.f53598a, self.ua);
        }
        if (output.k(serialDesc, 8) || self.ifa != null) {
            output.w(serialDesc, 8, v2.f53598a, self.ifa);
        }
        if (output.k(serialDesc, 9) || self.lmt != null) {
            output.w(serialDesc, 9, u0.f53588a, self.lmt);
        }
        if (!output.k(serialDesc, 10) && self.ext == null) {
            return;
        }
        output.w(serialDesc, 10, VungleExt.a.INSTANCE, self.ext);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMake() {
        return this.make;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getLmt() {
        return this.lmt;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final VungleExt getExt() {
        return this.ext;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOsv() {
        return this.osv;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCarrier() {
        return this.carrier;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getW() {
        return this.w;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getH() {
        return this.h;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUa() {
        return this.ua;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIfa() {
        return this.ifa;
    }

    public final DeviceNode copy(String make, String model, String osv, String carrier, String os, int w10, int h10, String ua2, String ifa, Integer lmt, VungleExt ext) {
        s.h(make, "make");
        s.h(model, "model");
        s.h(osv, "osv");
        s.h(os, "os");
        return new DeviceNode(make, model, osv, carrier, os, w10, h10, ua2, ifa, lmt, ext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceNode)) {
            return false;
        }
        DeviceNode deviceNode = (DeviceNode) other;
        return s.c(this.make, deviceNode.make) && s.c(this.model, deviceNode.model) && s.c(this.osv, deviceNode.osv) && s.c(this.carrier, deviceNode.carrier) && s.c(this.os, deviceNode.os) && this.w == deviceNode.w && this.h == deviceNode.h && s.c(this.ua, deviceNode.ua) && s.c(this.ifa, deviceNode.ifa) && s.c(this.lmt, deviceNode.lmt) && s.c(this.ext, deviceNode.ext);
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final VungleExt getExt() {
        return this.ext;
    }

    public final int getH() {
        return this.h;
    }

    public final String getIfa() {
        return this.ifa;
    }

    public final Integer getLmt() {
        return this.lmt;
    }

    public final String getMake() {
        return this.make;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getOsv() {
        return this.osv;
    }

    public final String getUa() {
        return this.ua;
    }

    public final int getW() {
        return this.w;
    }

    public int hashCode() {
        int iHashCode = ((((this.make.hashCode() * 31) + this.model.hashCode()) * 31) + this.osv.hashCode()) * 31;
        String str = this.carrier;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.os.hashCode()) * 31) + Integer.hashCode(this.w)) * 31) + Integer.hashCode(this.h)) * 31;
        String str2 = this.ua;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ifa;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.lmt;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        VungleExt vungleExt = this.ext;
        return iHashCode5 + (vungleExt != null ? vungleExt.hashCode() : 0);
    }

    public final void setExt(VungleExt vungleExt) {
        this.ext = vungleExt;
    }

    public final void setH(int i10) {
        this.h = i10;
    }

    public final void setIfa(String str) {
        this.ifa = str;
    }

    public final void setLmt(Integer num) {
        this.lmt = num;
    }

    public final void setUa(String str) {
        this.ua = str;
    }

    public final void setW(int i10) {
        this.w = i10;
    }

    public String toString() {
        return "DeviceNode(make=" + this.make + ", model=" + this.model + ", osv=" + this.osv + ", carrier=" + this.carrier + ", os=" + this.os + ", w=" + this.w + ", h=" + this.h + ", ua=" + this.ua + ", ifa=" + this.ifa + ", lmt=" + this.lmt + ", ext=" + this.ext + ')';
    }

    public DeviceNode(String make, String model, String osv, String str, String os, int i10, int i11, String str2, String str3, Integer num, VungleExt vungleExt) {
        s.h(make, "make");
        s.h(model, "model");
        s.h(osv, "osv");
        s.h(os, "os");
        this.make = make;
        this.model = model;
        this.osv = osv;
        this.carrier = str;
        this.os = os;
        this.w = i10;
        this.h = i11;
        this.ua = str2;
        this.ifa = str3;
        this.lmt = num;
        this.ext = vungleExt;
    }

    public /* synthetic */ DeviceNode(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, String str7, Integer num, VungleExt vungleExt, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i12 & 8) != 0 ? null : str4, str5, i10, i11, (i12 & 128) != 0 ? null : str6, (i12 & 256) != 0 ? null : str7, (i12 & 512) != 0 ? null : num, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : vungleExt);
    }
}
