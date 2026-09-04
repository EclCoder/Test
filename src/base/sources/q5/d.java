package q5;

import android.util.Log;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f50392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f50393c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f50391a = new byte[256];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50394d = 0;

    private boolean b() {
        return this.f50393c.f50379b != 0;
    }

    private int d() {
        try {
            return this.f50392b.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        } catch (Exception unused) {
            this.f50393c.f50379b = 1;
            return 0;
        }
    }

    private void e() {
        this.f50393c.f50381d.f50367a = n();
        this.f50393c.f50381d.f50368b = n();
        this.f50393c.f50381d.f50369c = n();
        this.f50393c.f50381d.f50370d = n();
        int iD = d();
        boolean z10 = (iD & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iD & 7) + 1);
        b bVar = this.f50393c.f50381d;
        bVar.f50371e = (iD & 64) != 0;
        if (z10) {
            bVar.f50377k = g(iPow);
        } else {
            bVar.f50377k = null;
        }
        this.f50393c.f50381d.f50376j = this.f50392b.position();
        r();
        if (b()) {
            return;
        }
        c cVar = this.f50393c;
        cVar.f50380c++;
        cVar.f50382e.add(cVar.f50381d);
    }

    private void f() {
        int iD = d();
        this.f50394d = iD;
        if (iD <= 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                int i12 = this.f50394d;
                if (i10 >= i12) {
                    return;
                }
                i11 = i12 - i10;
                this.f50392b.get(this.f50391a, i10, i11);
                i10 += i11;
            } catch (Exception e10) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i10 + " count: " + i11 + " blockSize: " + this.f50394d, e10);
                }
                this.f50393c.f50379b = 1;
                return;
            }
        }
    }

    private int[] g(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f50392b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int i14 = i12 + 2;
                int i15 = bArr[i12 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                i12 += 3;
                int i16 = i11 + 1;
                iArr[i11] = (i15 << 8) | (i13 << 16) | (-16777216) | (bArr[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                i11 = i16;
            }
            return iArr;
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f50393c.f50379b = 1;
            return iArr;
        }
    }

    private void h() {
        i(Integer.MAX_VALUE);
    }

    private void i(int i10) {
        boolean z10 = false;
        while (!z10 && !b() && this.f50393c.f50380c <= i10) {
            int iD = d();
            if (iD == 33) {
                int iD2 = d();
                if (iD2 == 1) {
                    q();
                } else if (iD2 == 249) {
                    this.f50393c.f50381d = new b();
                    j();
                } else if (iD2 == 254) {
                    q();
                } else if (iD2 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < 11; i11++) {
                        sb2.append((char) this.f50391a[i11]);
                    }
                    if (sb2.toString().equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (iD == 44) {
                c cVar = this.f50393c;
                if (cVar.f50381d == null) {
                    cVar.f50381d = new b();
                }
                e();
            } else if (iD != 59) {
                this.f50393c.f50379b = 1;
            } else {
                z10 = true;
            }
        }
    }

    private void j() {
        d();
        int iD = d();
        b bVar = this.f50393c.f50381d;
        int i10 = (iD & 28) >> 2;
        bVar.f50373g = i10;
        if (i10 == 0) {
            bVar.f50373g = 1;
        }
        bVar.f50372f = (iD & 1) != 0;
        int iN = n();
        if (iN < 2) {
            iN = 10;
        }
        b bVar2 = this.f50393c.f50381d;
        bVar2.f50375i = iN * 10;
        bVar2.f50374h = d();
        d();
    }

    private void k() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) d());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f50393c.f50379b = 1;
            return;
        }
        l();
        if (!this.f50393c.f50385h || b()) {
            return;
        }
        c cVar = this.f50393c;
        cVar.f50378a = g(cVar.f50386i);
        c cVar2 = this.f50393c;
        cVar2.f50389l = cVar2.f50378a[cVar2.f50387j];
    }

    private void l() {
        this.f50393c.f50383f = n();
        this.f50393c.f50384g = n();
        int iD = d();
        c cVar = this.f50393c;
        cVar.f50385h = (iD & 128) != 0;
        cVar.f50386i = (int) Math.pow(2.0d, (iD & 7) + 1);
        this.f50393c.f50387j = d();
        this.f50393c.f50388k = d();
    }

    private void m() {
        do {
            f();
            byte[] bArr = this.f50391a;
            if (bArr[0] == 1) {
                this.f50393c.f50390m = ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            }
            if (this.f50394d <= 0) {
                return;
            }
        } while (!b());
    }

    private int n() {
        return this.f50392b.getShort();
    }

    private void o() {
        this.f50392b = null;
        Arrays.fill(this.f50391a, (byte) 0);
        this.f50393c = new c();
        this.f50394d = 0;
    }

    private void q() {
        int iD;
        do {
            iD = d();
            this.f50392b.position(Math.min(this.f50392b.position() + iD, this.f50392b.limit()));
        } while (iD > 0);
    }

    private void r() {
        d();
        q();
    }

    public void a() {
        this.f50392b = null;
        this.f50393c = null;
    }

    public c c() {
        if (this.f50392b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f50393c;
        }
        k();
        if (!b()) {
            h();
            c cVar = this.f50393c;
            if (cVar.f50380c < 0) {
                cVar.f50379b = 1;
            }
        }
        return this.f50393c;
    }

    public d p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f50392b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f50392b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
