package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import c2.x1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import w1.c0;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class n implements m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m.c f5267d = new m.c() { // from class: e2.m
        @Override // androidx.media3.exoplayer.drm.m.c
        public final androidx.media3.exoplayer.drm.m a(UUID uuid) {
            return androidx.media3.exoplayer.drm.n.g(uuid);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UUID f5268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediaDrm f5269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5270c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, x1 x1Var) {
            LogSessionId logSessionIdA = x1Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            e2.o.a(w1.a.e(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionIdA);
        }
    }

    private n(UUID uuid) {
        w1.a.e(uuid);
        w1.a.b(!t1.e.f52664b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f5268a = uuid;
        MediaDrm mediaDrm = new MediaDrm(n(uuid));
        this.f5269b = mediaDrm;
        this.f5270c = 1;
        if (t1.e.f52666d.equals(uuid) && t()) {
            p(mediaDrm);
        }
    }

    public static /* synthetic */ m g(UUID uuid) {
        try {
            return u(uuid);
        } catch (UnsupportedDrmException unused) {
            w1.n.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new k();
        }
    }

    public static /* synthetic */ void h(n nVar, m.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        nVar.getClass();
        bVar.a(nVar, bArr, i10, i11, bArr2);
    }

    private static byte[] i(byte[] bArr) {
        u uVar = new u(bArr);
        int iT = uVar.t();
        short sV = uVar.v();
        short sV2 = uVar.v();
        if (sV != 1 || sV2 != 1) {
            w1.n.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short sV3 = uVar.v();
        Charset charset = sc.e.f52296e;
        String strE = uVar.E(sV3, charset);
        if (strE.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strE.indexOf("</DATA>");
        if (iIndexOf == -1) {
            w1.n.h("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = strE.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strE.substring(iIndexOf);
        int i10 = iT + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i10);
        byteBufferAllocate.putShort(sV);
        byteBufferAllocate.putShort(sV2);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(charset));
        return byteBufferAllocate.array();
    }

    private String j(String str) {
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            return "";
        }
        if (c0.f55769a >= 33 && "https://default.url".equals(str)) {
            String strQ = q("version");
            if (Objects.equals(strQ, "1.2") || Objects.equals(strQ, "aidl-1")) {
                return "";
            }
        }
        return str;
    }

    private static byte[] k(UUID uuid, byte[] bArr) {
        return t1.e.f52665c.equals(uuid) ? androidx.media3.exoplayer.drm.a.a(bArr) : bArr;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e A[RETURN] */
    private static byte[] l(UUID uuid, byte[] bArr) {
        byte[] bArrE;
        UUID uuid2 = t1.e.f52667e;
        if (uuid2.equals(uuid)) {
            byte[] bArrE2 = i3.o.e(bArr, uuid);
            if (bArrE2 != null) {
                bArr = bArrE2;
            }
            bArr = i3.o.a(uuid2, i(bArr));
        }
        if (c0.f55769a < 23 && t1.e.f52666d.equals(uuid)) {
            bArrE = i3.o.e(bArr, uuid);
            if (bArrE != null) {
                return bArrE;
            }
        } else if (uuid2.equals(uuid) && "Amazon".equals(c0.f55771c)) {
            String str = c0.f55772d;
            if ("AFTB".equals(str) || "AFTS".equals(str) || "AFTM".equals(str) || "AFTT".equals(str)) {
                bArrE = i3.o.e(bArr, uuid);
                if (bArrE != null) {
                    return bArrE;
                }
            }
        }
        return bArr;
    }

    private static String m(UUID uuid, String str) {
        return (c0.f55769a < 26 && t1.e.f52665c.equals(uuid) && (MimeTypes.VIDEO_MP4.equals(str) || MimeTypes.AUDIO_MP4.equals(str))) ? C.CENC_TYPE_cenc : str;
    }

    private static UUID n(UUID uuid) {
        return (c0.f55769a >= 27 || !t1.e.f52665c.equals(uuid)) ? uuid : t1.e.f52664b;
    }

    private static void p(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static t1.k.b r(UUID uuid, List list) {
        if (!t1.e.f52666d.equals(uuid)) {
            return (t1.k.b) list.get(0);
        }
        if (c0.f55769a >= 28 && list.size() > 1) {
            t1.k.b bVar = (t1.k.b) list.get(0);
            int i10 = 0;
            int length = 0;
            while (true) {
                if (i10 >= list.size()) {
                    byte[] bArr = new byte[length];
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        byte[] bArr2 = (byte[]) w1.a.e(((t1.k.b) list.get(i12)).f52720e);
                        int length2 = bArr2.length;
                        System.arraycopy(bArr2, 0, bArr, i11, length2);
                        i11 += length2;
                    }
                    return bVar.a(bArr);
                }
                t1.k.b bVar2 = (t1.k.b) list.get(i10);
                byte[] bArr3 = (byte[]) w1.a.e(bVar2.f52720e);
                if (!c0.c(bVar2.f52719d, bVar.f52719d) || !c0.c(bVar2.f52718c, bVar.f52718c) || !i3.o.c(bArr3)) {
                    break;
                }
                length += bArr3.length;
                i10++;
            }
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            t1.k.b bVar3 = (t1.k.b) list.get(i13);
            int iG = i3.o.g((byte[]) w1.a.e(bVar3.f52720e));
            int i14 = c0.f55769a;
            if ((i14 < 23 && iG == 0) || (i14 >= 23 && iG == 1)) {
                return bVar3;
            }
        }
        return (t1.k.b) list.get(0);
    }

    private boolean s() {
        if (!this.f5268a.equals(t1.e.f52666d)) {
            return this.f5268a.equals(t1.e.f52665c);
        }
        String strQ = q("version");
        return (strQ.startsWith("v5.") || strQ.startsWith("14.") || strQ.startsWith("15.") || strQ.startsWith("16.0")) ? false : true;
    }

    private static boolean t() {
        return "ASUS_Z00AD".equals(c0.f55772d);
    }

    public static n u(UUID uuid) throws UnsupportedDrmException {
        try {
            return new n(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new UnsupportedDrmException(1, e10);
        } catch (Exception e11) {
            throw new UnsupportedDrmException(2, e11);
        }
    }

    private boolean v() {
        return c0.f55769a < 21 && t1.e.f52666d.equals(this.f5268a) && "L3".equals(q("securityLevel"));
    }

    @Override // androidx.media3.exoplayer.drm.m
    public int a() {
        return 2;
    }

    @Override // androidx.media3.exoplayer.drm.m
    public boolean c(byte[] bArr, String str) throws Throwable {
        boolean zRequiresSecureDecoderComponent;
        if (c0.f55769a < 31 || !s()) {
            MediaCrypto mediaCrypto = null;
            try {
                MediaCrypto mediaCrypto2 = new MediaCrypto(this.f5268a, bArr);
                try {
                    zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                    mediaCrypto2.release();
                } catch (MediaCryptoException unused) {
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    zRequiresSecureDecoderComponent = true;
                } catch (Throwable th2) {
                    th = th2;
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (MediaCryptoException unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            zRequiresSecureDecoderComponent = a.a(this.f5269b, str);
        }
        return zRequiresSecureDecoderComponent && !v();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void closeSession(byte[] bArr) {
        this.f5269b.closeSession(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.m
    public m.a d(byte[] bArr, List list, int i10, HashMap map) throws NotProvisionedException {
        t1.k.b bVarR;
        byte[] bArrL;
        String strM;
        if (list != null) {
            bVarR = r(this.f5268a, list);
            bArrL = l(this.f5268a, (byte[]) w1.a.e(bVarR.f52720e));
            strM = m(this.f5268a, bVarR.f52719d);
        } else {
            bVarR = null;
            bArrL = null;
            strM = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f5269b.getKeyRequest(bArr, bArrL, strM, i10, map);
        byte[] bArrK = k(this.f5268a, keyRequest.getData());
        String strJ = j(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(strJ) && bVarR != null && !TextUtils.isEmpty(bVarR.f52718c)) {
            strJ = bVarR.f52718c;
        }
        return new m.a(bArrK, strJ, c0.f55769a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void e(byte[] bArr, x1 x1Var) {
        if (c0.f55769a >= 31) {
            try {
                a.b(this.f5269b, bArr, x1Var);
            } catch (UnsupportedOperationException unused) {
                w1.n.h("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void f(final m.b bVar) {
        this.f5269b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: e2.n
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                androidx.media3.exoplayer.drm.n.h(this.f37057a, bVar, mediaDrm, bArr, i10, i11, bArr2);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.m
    public m.d getProvisionRequest() {
        MediaDrm.ProvisionRequest provisionRequest = this.f5269b.getProvisionRequest();
        return new m.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // androidx.media3.exoplayer.drm.m
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public e2.l b(byte[] bArr) {
        return new e2.l(n(this.f5268a), bArr, v());
    }

    @Override // androidx.media3.exoplayer.drm.m
    public byte[] openSession() {
        return this.f5269b.openSession();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        if (t1.e.f52665c.equals(this.f5268a)) {
            bArr2 = androidx.media3.exoplayer.drm.a.b(bArr2);
        }
        return this.f5269b.provideKeyResponse(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void provideProvisionResponse(byte[] bArr) throws DeniedByServerException {
        this.f5269b.provideProvisionResponse(bArr);
    }

    public String q(String str) {
        return this.f5269b.getPropertyString(str);
    }

    @Override // androidx.media3.exoplayer.drm.m
    public Map queryKeyStatus(byte[] bArr) {
        return this.f5269b.queryKeyStatus(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.m
    public synchronized void release() {
        int i10 = this.f5270c - 1;
        this.f5270c = i10;
        if (i10 == 0) {
            this.f5269b.release();
        }
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.f5269b.restoreKeys(bArr, bArr2);
    }
}
