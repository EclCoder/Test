package com.vungle.ads.internal.model;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.UnknownFieldException;
import tm.b2;
import tm.g2;
import tm.l0;
import tm.q2;
import tm.u0;

/* JADX INFO: renamed from: com.vungle.ads.internal.model.m, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;<B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBM\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\"\u0010#JH\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b)\u0010#J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010!R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00106\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010#¨\u0006="}, d2 = {"Lcom/vungle/ads/internal/model/m;", "", "Lcom/vungle/ads/internal/model/h;", "device", "Lcom/vungle/ads/internal/model/f$k;", "user", "Lcom/vungle/ads/internal/model/f$i;", "ext", "Lcom/vungle/ads/internal/model/l;", com.vungle.ads.internal.ui.b.REQUEST_KEY_EXTRA, "", "ordinalView", "<init>", "(Lcom/vungle/ads/internal/model/h;Lcom/vungle/ads/internal/model/f$k;Lcom/vungle/ads/internal/model/f$i;Lcom/vungle/ads/internal/model/l;I)V", "seen1", "Ltm/q2;", "serializationConstructorMarker", "(ILcom/vungle/ads/internal/model/h;Lcom/vungle/ads/internal/model/f$k;Lcom/vungle/ads/internal/model/f$i;Lcom/vungle/ads/internal/model/l;ILtm/q2;)V", "self", "Lsm/d;", "output", "Lrm/f;", "serialDesc", "Lfl/g0;", "write$Self", "(Lcom/vungle/ads/internal/model/m;Lsm/d;Lrm/f;)V", "component1", "()Lcom/vungle/ads/internal/model/h;", "component2", "()Lcom/vungle/ads/internal/model/f$k;", "component3", "()Lcom/vungle/ads/internal/model/f$i;", "component4", "()Lcom/vungle/ads/internal/model/l;", "component5", "()I", "copy", "(Lcom/vungle/ads/internal/model/h;Lcom/vungle/ads/internal/model/f$k;Lcom/vungle/ads/internal/model/f$i;Lcom/vungle/ads/internal/model/l;I)Lcom/vungle/ads/internal/model/m;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/vungle/ads/internal/model/h;", "getDevice", "Lcom/vungle/ads/internal/model/f$k;", "getUser", "Lcom/vungle/ads/internal/model/f$i;", "getExt", "Lcom/vungle/ads/internal/model/l;", "getRequest", "I", "getOrdinalView", "getOrdinalView$annotations", "()V", "Companion", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@pm.k
public final /* data */ class RtbToken {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final DeviceNode device;
    private final CommonRequestBody.RequestExt ext;
    private final int ordinalView;
    private final RtbRequest request;
    private final CommonRequestBody.User user;

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.m$a */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements l0 {
        public static final a INSTANCE;
        public static final /* synthetic */ rm.f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            g2 g2Var = new g2("com.vungle.ads.internal.model.RtbToken", aVar, 5);
            g2Var.p("device", false);
            g2Var.p("user", true);
            g2Var.p("ext", true);
            g2Var.p(com.vungle.ads.internal.ui.b.REQUEST_KEY_EXTRA, true);
            g2Var.p("ordinal_view", false);
            descriptor = g2Var;
        }

        private a() {
        }

        @Override // tm.l0
        public pm.d[] childSerializers() {
            return new pm.d[]{DeviceNode.a.INSTANCE, qm.a.t(CommonRequestBody.User.a.INSTANCE), qm.a.t(CommonRequestBody.RequestExt.a.INSTANCE), qm.a.t(RtbRequest.a.INSTANCE), u0.f53588a};
        }

        @Override // pm.c
        public RtbToken deserialize(sm.e decoder) {
            int i10;
            Object objE;
            Object objE2;
            Object objE3;
            int iS;
            Object objN;
            s.h(decoder, "decoder");
            rm.f descriptor2 = getDescriptor();
            sm.c cVarB = decoder.b(descriptor2);
            if (cVarB.l()) {
                objN = cVarB.n(descriptor2, 0, DeviceNode.a.INSTANCE, null);
                objE = cVarB.e(descriptor2, 1, CommonRequestBody.User.a.INSTANCE, null);
                objE2 = cVarB.e(descriptor2, 2, CommonRequestBody.RequestExt.a.INSTANCE, null);
                objE3 = cVarB.e(descriptor2, 3, RtbRequest.a.INSTANCE, null);
                i10 = 31;
                iS = cVarB.s(descriptor2, 4);
            } else {
                boolean z10 = true;
                int iS2 = 0;
                Object objN2 = null;
                Object objE4 = null;
                Object objE5 = null;
                Object objE6 = null;
                int i11 = 0;
                while (z10) {
                    int iO = cVarB.o(descriptor2);
                    if (iO == -1) {
                        z10 = false;
                    } else if (iO == 0) {
                        objN2 = cVarB.n(descriptor2, 0, DeviceNode.a.INSTANCE, objN2);
                        i11 |= 1;
                    } else if (iO == 1) {
                        objE4 = cVarB.e(descriptor2, 1, CommonRequestBody.User.a.INSTANCE, objE4);
                        i11 |= 2;
                    } else if (iO == 2) {
                        objE5 = cVarB.e(descriptor2, 2, CommonRequestBody.RequestExt.a.INSTANCE, objE5);
                        i11 |= 4;
                    } else if (iO == 3) {
                        objE6 = cVarB.e(descriptor2, 3, RtbRequest.a.INSTANCE, objE6);
                        i11 |= 8;
                    } else {
                        if (iO != 4) {
                            throw new UnknownFieldException(iO);
                        }
                        iS2 = cVarB.s(descriptor2, 4);
                        i11 |= 16;
                    }
                }
                i10 = i11;
                objE = objE4;
                objE2 = objE5;
                objE3 = objE6;
                iS = iS2;
                objN = objN2;
            }
            cVarB.d(descriptor2);
            return new RtbToken(i10, (DeviceNode) objN, (CommonRequestBody.User) objE, (CommonRequestBody.RequestExt) objE2, (RtbRequest) objE3, iS, (q2) null);
        }

        @Override // pm.d, pm.l, pm.c
        public rm.f getDescriptor() {
            return descriptor;
        }

        @Override // pm.l
        public void serialize(sm.f encoder, RtbToken value) {
            s.h(encoder, "encoder");
            s.h(value, "value");
            rm.f descriptor2 = getDescriptor();
            sm.d dVarB = encoder.b(descriptor2);
            RtbToken.write$Self(value, dVarB, descriptor2);
            dVarB.d(descriptor2);
        }

        @Override // tm.l0
        public pm.d[] typeParametersSerializers() {
            return l0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.model.m$b, reason: from kotlin metadata */
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

    public /* synthetic */ RtbToken(int i10, DeviceNode deviceNode, CommonRequestBody.User user, CommonRequestBody.RequestExt requestExt, RtbRequest rtbRequest, int i11, q2 q2Var) {
        if (17 != (i10 & 17)) {
            b2.a(i10, 17, a.INSTANCE.getDescriptor());
        }
        this.device = deviceNode;
        if ((i10 & 2) == 0) {
            this.user = null;
        } else {
            this.user = user;
        }
        if ((i10 & 4) == 0) {
            this.ext = null;
        } else {
            this.ext = requestExt;
        }
        if ((i10 & 8) == 0) {
            this.request = null;
        } else {
            this.request = rtbRequest;
        }
        this.ordinalView = i11;
    }

    public static /* synthetic */ RtbToken copy$default(RtbToken rtbToken, DeviceNode deviceNode, CommonRequestBody.User user, CommonRequestBody.RequestExt requestExt, RtbRequest rtbRequest, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            deviceNode = rtbToken.device;
        }
        if ((i11 & 2) != 0) {
            user = rtbToken.user;
        }
        if ((i11 & 4) != 0) {
            requestExt = rtbToken.ext;
        }
        if ((i11 & 8) != 0) {
            rtbRequest = rtbToken.request;
        }
        if ((i11 & 16) != 0) {
            i10 = rtbToken.ordinalView;
        }
        int i12 = i10;
        CommonRequestBody.RequestExt requestExt2 = requestExt;
        return rtbToken.copy(deviceNode, user, requestExt2, rtbRequest, i12);
    }

    public static final void write$Self(RtbToken self, sm.d output, rm.f serialDesc) {
        s.h(self, "self");
        s.h(output, "output");
        s.h(serialDesc, "serialDesc");
        output.A(serialDesc, 0, DeviceNode.a.INSTANCE, self.device);
        if (output.k(serialDesc, 1) || self.user != null) {
            output.w(serialDesc, 1, CommonRequestBody.User.a.INSTANCE, self.user);
        }
        if (output.k(serialDesc, 2) || self.ext != null) {
            output.w(serialDesc, 2, CommonRequestBody.RequestExt.a.INSTANCE, self.ext);
        }
        if (output.k(serialDesc, 3) || self.request != null) {
            output.w(serialDesc, 3, RtbRequest.a.INSTANCE, self.request);
        }
        output.i(serialDesc, 4, self.ordinalView);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DeviceNode getDevice() {
        return this.device;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CommonRequestBody.User getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CommonRequestBody.RequestExt getExt() {
        return this.ext;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RtbRequest getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getOrdinalView() {
        return this.ordinalView;
    }

    public final RtbToken copy(DeviceNode device, CommonRequestBody.User user, CommonRequestBody.RequestExt ext, RtbRequest request, int ordinalView) {
        s.h(device, "device");
        return new RtbToken(device, user, ext, request, ordinalView);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RtbToken)) {
            return false;
        }
        RtbToken rtbToken = (RtbToken) other;
        return s.c(this.device, rtbToken.device) && s.c(this.user, rtbToken.user) && s.c(this.ext, rtbToken.ext) && s.c(this.request, rtbToken.request) && this.ordinalView == rtbToken.ordinalView;
    }

    public final DeviceNode getDevice() {
        return this.device;
    }

    public final CommonRequestBody.RequestExt getExt() {
        return this.ext;
    }

    public final int getOrdinalView() {
        return this.ordinalView;
    }

    public final RtbRequest getRequest() {
        return this.request;
    }

    public final CommonRequestBody.User getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = this.device.hashCode() * 31;
        CommonRequestBody.User user = this.user;
        int iHashCode2 = (iHashCode + (user == null ? 0 : user.hashCode())) * 31;
        CommonRequestBody.RequestExt requestExt = this.ext;
        int iHashCode3 = (iHashCode2 + (requestExt == null ? 0 : requestExt.hashCode())) * 31;
        RtbRequest rtbRequest = this.request;
        return ((iHashCode3 + (rtbRequest != null ? rtbRequest.hashCode() : 0)) * 31) + Integer.hashCode(this.ordinalView);
    }

    public String toString() {
        return "RtbToken(device=" + this.device + ", user=" + this.user + ", ext=" + this.ext + ", request=" + this.request + ", ordinalView=" + this.ordinalView + ')';
    }

    public RtbToken(DeviceNode device, CommonRequestBody.User user, CommonRequestBody.RequestExt requestExt, RtbRequest rtbRequest, int i10) {
        s.h(device, "device");
        this.device = device;
        this.user = user;
        this.ext = requestExt;
        this.request = rtbRequest;
        this.ordinalView = i10;
    }

    public /* synthetic */ RtbToken(DeviceNode deviceNode, CommonRequestBody.User user, CommonRequestBody.RequestExt requestExt, RtbRequest rtbRequest, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceNode, (i11 & 2) != 0 ? null : user, (i11 & 4) != 0 ? null : requestExt, (i11 & 8) != 0 ? null : rtbRequest, i10);
    }

    public static /* synthetic */ void getOrdinalView$annotations() {
    }
}
