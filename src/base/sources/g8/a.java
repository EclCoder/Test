package g8;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.fasterxml.jackson.core.io.b f38955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InputStream f38956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f38957c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f38962h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f38961g = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f38958d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f38959e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f38960f = true;

    public a(com.fasterxml.jackson.core.io.b bVar, InputStream inputStream) {
        this.f38955a = bVar;
        this.f38956b = inputStream;
        this.f38957c = bVar.e();
    }

    private boolean a(int i10) {
        if ((65280 & i10) == 0) {
            this.f38961g = true;
        } else {
            if ((i10 & 255) != 0) {
                return false;
            }
            this.f38961g = false;
        }
        this.f38962h = 2;
        return true;
    }

    private boolean b(int i10) throws CharConversionException {
        if ((i10 >> 8) == 0) {
            this.f38961g = true;
        } else if ((16777215 & i10) == 0) {
            this.f38961g = false;
        } else if (((-16711681) & i10) == 0) {
            h("3412");
        } else {
            if ((i10 & (-65281)) != 0) {
                return false;
            }
            h("2143");
        }
        this.f38962h = 4;
        return true;
    }

    private boolean g(int i10) throws CharConversionException {
        if (i10 == -16842752) {
            h("3412");
        } else {
            if (i10 == -131072) {
                this.f38958d += 4;
                this.f38962h = 4;
                this.f38961g = false;
                return true;
            }
            if (i10 == 65279) {
                this.f38961g = true;
                this.f38958d += 4;
                this.f38962h = 4;
                return true;
            }
            if (i10 == 65534) {
                h("2143");
            }
        }
        int i11 = i10 >>> 16;
        if (i11 == 65279) {
            this.f38958d += 2;
            this.f38962h = 2;
            this.f38961g = true;
            return true;
        }
        if (i11 == 65534) {
            this.f38958d += 2;
            this.f38962h = 2;
            this.f38961g = false;
            return true;
        }
        if ((i10 >>> 8) != 15711167) {
            return false;
        }
        this.f38958d += 3;
        this.f38962h = 1;
        this.f38961g = true;
        return true;
    }

    private void h(String str) throws CharConversionException {
        throw new CharConversionException("Unsupported UCS-4 endianness (" + str + ") detected");
    }

    public com.fasterxml.jackson.core.e c(int i10, com.fasterxml.jackson.core.h hVar, h8.a aVar, h8.b bVar, int i11) {
        int i12 = this.f38958d;
        com.fasterxml.jackson.core.a aVarE = e();
        int i13 = this.f38958d - i12;
        if (aVarE != com.fasterxml.jackson.core.a.UTF8 || !com.fasterxml.jackson.core.b.a.CANONICALIZE_FIELD_NAMES.h(i11)) {
            return new g(this.f38955a, i10, d(), hVar, bVar.q(i11));
        }
        return new i(this.f38955a, i10, this.f38956b, hVar, aVar.H(i11), this.f38957c, this.f38958d, this.f38959e, i13, this.f38960f);
    }

    public Reader d() {
        com.fasterxml.jackson.core.a aVarJ = this.f38955a.j();
        int iD = aVarJ.d();
        if (iD != 8 && iD != 16) {
            if (iD != 32) {
                throw new RuntimeException("Internal error");
            }
            com.fasterxml.jackson.core.io.b bVar = this.f38955a;
            return new com.fasterxml.jackson.core.io.h(bVar, this.f38956b, this.f38957c, this.f38958d, this.f38959e, bVar.j().h());
        }
        InputStream dVar = this.f38956b;
        if (dVar == null) {
            dVar = new ByteArrayInputStream(this.f38957c, this.f38958d, this.f38959e);
        } else if (this.f38958d < this.f38959e) {
            dVar = new com.fasterxml.jackson.core.io.d(this.f38955a, dVar, this.f38957c, this.f38958d, this.f38959e);
        }
        return new InputStreamReader(dVar, aVarJ.g());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    public com.fasterxml.jackson.core.a e() {
        int i10;
        com.fasterxml.jackson.core.a aVar;
        if (f(4)) {
            byte[] bArr = this.f38957c;
            int i11 = this.f38958d;
            int i12 = (bArr[i11 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr[i11] << 24) | ((bArr[i11 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i11 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
            if (g(i12) || b(i12) || a(i12 >>> 16)) {
                i10 = this.f38962h;
                if (i10 != 1) {
                    aVar = com.fasterxml.jackson.core.a.UTF8;
                } else if (i10 != 2) {
                    if (i10 == 4) {
                        throw new RuntimeException("Internal error");
                    }
                    if (this.f38961g) {
                        aVar = com.fasterxml.jackson.core.a.UTF32_BE;
                    } else {
                        aVar = com.fasterxml.jackson.core.a.UTF32_LE;
                    }
                } else if (this.f38961g) {
                    aVar = com.fasterxml.jackson.core.a.UTF16_BE;
                } else {
                    aVar = com.fasterxml.jackson.core.a.UTF16_LE;
                }
            } else {
                aVar = com.fasterxml.jackson.core.a.UTF8;
            }
        } else {
            if (f(2)) {
                byte[] bArr2 = this.f38957c;
                int i13 = this.f38958d;
                if (a((bArr2[i13 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr2[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8))) {
                    i10 = this.f38962h;
                    if (i10 != 1) {
                        aVar = com.fasterxml.jackson.core.a.UTF8;
                    } else if (i10 != 2) {
                        if (i10 == 4) {
                            throw new RuntimeException("Internal error");
                        }
                        if (this.f38961g) {
                            aVar = com.fasterxml.jackson.core.a.UTF32_BE;
                        } else {
                            aVar = com.fasterxml.jackson.core.a.UTF32_LE;
                        }
                    } else if (this.f38961g) {
                        aVar = com.fasterxml.jackson.core.a.UTF16_BE;
                    } else {
                        aVar = com.fasterxml.jackson.core.a.UTF16_LE;
                    }
                }
            }
            aVar = com.fasterxml.jackson.core.a.UTF8;
        }
        this.f38955a.r(aVar);
        return aVar;
    }

    protected boolean f(int i10) throws IOException {
        int i11;
        int i12 = this.f38959e - this.f38958d;
        while (i12 < i10) {
            InputStream inputStream = this.f38956b;
            if (inputStream == null) {
                i11 = -1;
            } else {
                byte[] bArr = this.f38957c;
                int i13 = this.f38959e;
                i11 = inputStream.read(bArr, i13, bArr.length - i13);
            }
            if (i11 < 1) {
                return false;
            }
            this.f38959e += i11;
            i12 += i11;
        }
        return true;
    }
}
