package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import ob.d0;
import ob.r0;
import ob.u;
import p9.s1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n.c f16877d = new n.c() { // from class: t9.m
        @Override // com.google.android.exoplayer2.drm.n.c
        public final com.google.android.exoplayer2.drm.n a(UUID uuid) {
            return com.google.android.exoplayer2.drm.o.g(uuid);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UUID f16878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediaDrm f16879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16880c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, s1 s1Var) {
            LogSessionId logSessionIdA = s1Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            e2.o.a(ob.a.e(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionIdA);
        }
    }

    private o(UUID uuid) {
        ob.a.e(uuid);
        ob.a.b(!o9.b.f48263b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f16878a = uuid;
        MediaDrm mediaDrm = new MediaDrm(n(uuid));
        this.f16879b = mediaDrm;
        this.f16880c = 1;
        if (o9.b.f48265d.equals(uuid) && s()) {
            p(mediaDrm);
        }
    }

    public static /* synthetic */ n g(UUID uuid) {
        try {
            return t(uuid);
        } catch (UnsupportedDrmException unused) {
            u.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new l();
        }
    }

    public static /* synthetic */ void h(o oVar, n.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        oVar.getClass();
        bVar.a(oVar, bArr, i10, i11, bArr2);
    }

    private static byte[] i(byte[] bArr) {
        d0 d0Var = new d0(bArr);
        int iU = d0Var.u();
        short sW = d0Var.w();
        short sW2 = d0Var.w();
        if (sW != 1 || sW2 != 1) {
            u.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short sW3 = d0Var.w();
        Charset charset = sc.e.f52296e;
        String strF = d0Var.F(sW3, charset);
        if (strF.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strF.indexOf("</DATA>");
        if (iIndexOf == -1) {
            u.i("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = strF.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strF.substring(iIndexOf);
        int i10 = iU + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i10);
        byteBufferAllocate.putShort(sW);
        byteBufferAllocate.putShort(sW2);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(charset));
        return byteBufferAllocate.array();
    }

    private static String j(String str) {
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            return "";
        }
        return (r0.f48425a == 33 && "https://default.url".equals(str)) ? "" : str;
    }

    private static byte[] k(UUID uuid, byte[] bArr) {
        return o9.b.f48264c.equals(uuid) ? com.google.android.exoplayer2.drm.a.a(bArr) : bArr;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e A[RETURN] */
    private static byte[] l(UUID uuid, byte[] bArr) {
        byte[] bArrE;
        UUID uuid2 = o9.b.f48266e;
        if (uuid2.equals(uuid)) {
            byte[] bArrE2 = ca.l.e(bArr, uuid);
            if (bArrE2 != null) {
                bArr = bArrE2;
            }
            bArr = ca.l.a(uuid2, i(bArr));
        }
        if (r0.f48425a < 23 && o9.b.f48265d.equals(uuid)) {
            bArrE = ca.l.e(bArr, uuid);
            if (bArrE != null) {
                return bArrE;
            }
        } else if (uuid2.equals(uuid) && "Amazon".equals(r0.f48427c)) {
            String str = r0.f48428d;
            if ("AFTB".equals(str) || "AFTS".equals(str) || "AFTM".equals(str) || "AFTT".equals(str)) {
                bArrE = ca.l.e(bArr, uuid);
                if (bArrE != null) {
                    return bArrE;
                }
            }
        }
        return bArr;
    }

    private static String m(UUID uuid, String str) {
        return (r0.f48425a < 26 && o9.b.f48264c.equals(uuid) && (MimeTypes.VIDEO_MP4.equals(str) || MimeTypes.AUDIO_MP4.equals(str))) ? C.CENC_TYPE_cenc : str;
    }

    private static UUID n(UUID uuid) {
        return (r0.f48425a >= 27 || !o9.b.f48264c.equals(uuid)) ? uuid : o9.b.f48263b;
    }

    private static void p(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static h.b r(UUID uuid, List list) {
        if (!o9.b.f48265d.equals(uuid)) {
            return (h.b) list.get(0);
        }
        if (r0.f48425a >= 28 && list.size() > 1) {
            h.b bVar = (h.b) list.get(0);
            int i10 = 0;
            int length = 0;
            while (true) {
                if (i10 >= list.size()) {
                    byte[] bArr = new byte[length];
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        byte[] bArr2 = (byte[]) ob.a.e(((h.b) list.get(i12)).f16862e);
                        int length2 = bArr2.length;
                        System.arraycopy(bArr2, 0, bArr, i11, length2);
                        i11 += length2;
                    }
                    return bVar.b(bArr);
                }
                h.b bVar2 = (h.b) list.get(i10);
                byte[] bArr3 = (byte[]) ob.a.e(bVar2.f16862e);
                if (!r0.c(bVar2.f16861d, bVar.f16861d) || !r0.c(bVar2.f16860c, bVar.f16860c) || !ca.l.c(bArr3)) {
                    break;
                }
                length += bArr3.length;
                i10++;
            }
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            h.b bVar3 = (h.b) list.get(i13);
            int iG = ca.l.g((byte[]) ob.a.e(bVar3.f16862e));
            int i14 = r0.f48425a;
            if ((i14 < 23 && iG == 0) || (i14 >= 23 && iG == 1)) {
                return bVar3;
            }
        }
        return (h.b) list.get(0);
    }

    private static boolean s() {
        return "ASUS_Z00AD".equals(r0.f48428d);
    }

    public static o t(UUID uuid) throws UnsupportedDrmException {
        try {
            return new o(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new UnsupportedDrmException(1, e10);
        } catch (Exception e11) {
            throw new UnsupportedDrmException(2, e11);
        }
    }

    @Override // com.google.android.exoplayer2.drm.n
    public int a() {
        return 2;
    }

    @Override // com.google.android.exoplayer2.drm.n
    public boolean c(byte[] bArr, String str) {
        if (r0.f48425a >= 31) {
            return a.a(this.f16879b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f16878a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.drm.n
    public void closeSession(byte[] bArr) {
        this.f16879b.closeSession(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.n
    public n.a d(byte[] bArr, List list, int i10, HashMap map) throws NotProvisionedException {
        h.b bVarR;
        byte[] bArrL;
        String strM;
        if (list != null) {
            bVarR = r(this.f16878a, list);
            bArrL = l(this.f16878a, (byte[]) ob.a.e(bVarR.f16862e));
            strM = m(this.f16878a, bVarR.f16861d);
        } else {
            bVarR = null;
            bArrL = null;
            strM = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f16879b.getKeyRequest(bArr, bArrL, strM, i10, map);
        byte[] bArrK = k(this.f16878a, keyRequest.getData());
        String strJ = j(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(strJ) && bVarR != null && !TextUtils.isEmpty(bVarR.f16860c)) {
            strJ = bVarR.f16860c;
        }
        return new n.a(bArrK, strJ, r0.f48425a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // com.google.android.exoplayer2.drm.n
    public void e(final n.b bVar) {
        this.f16879b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: t9.n
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                com.google.android.exoplayer2.drm.o.h(this.f53182a, bVar, mediaDrm, bArr, i10, i11, bArr2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.n
    public void f(byte[] bArr, s1 s1Var) {
        if (r0.f48425a >= 31) {
            try {
                a.b(this.f16879b, bArr, s1Var);
            } catch (UnsupportedOperationException unused) {
                u.i("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.n
    public n.d getProvisionRequest() {
        MediaDrm.ProvisionRequest provisionRequest = this.f16879b.getProvisionRequest();
        return new n.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.google.android.exoplayer2.drm.n
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public t9.l b(byte[] bArr) {
        return new t9.l(n(this.f16878a), bArr, r0.f48425a < 21 && o9.b.f48265d.equals(this.f16878a) && "L3".equals(q("securityLevel")));
    }

    @Override // com.google.android.exoplayer2.drm.n
    public byte[] openSession() {
        return this.f16879b.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.n
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        if (o9.b.f48264c.equals(this.f16878a)) {
            bArr2 = com.google.android.exoplayer2.drm.a.b(bArr2);
        }
        return this.f16879b.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.n
    public void provideProvisionResponse(byte[] bArr) throws DeniedByServerException {
        this.f16879b.provideProvisionResponse(bArr);
    }

    public String q(String str) {
        return this.f16879b.getPropertyString(str);
    }

    @Override // com.google.android.exoplayer2.drm.n
    public Map queryKeyStatus(byte[] bArr) {
        return this.f16879b.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.n
    public synchronized void release() {
        int i10 = this.f16880c - 1;
        this.f16880c = i10;
        if (i10 == 0) {
            this.f16879b.release();
        }
    }

    @Override // com.google.android.exoplayer2.drm.n
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.f16879b.restoreKeys(bArr, bArr2);
    }
}
