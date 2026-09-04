package androidx.media;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4604a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4605b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4606c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4607d = -1;

    public int a() {
        return this.f4605b;
    }

    public int b() {
        int i10 = this.f4606c;
        int iC = c();
        if (iC == 6) {
            i10 |= 4;
        } else if (iC == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    public int c() {
        int i10 = this.f4607d;
        return i10 != -1 ? i10 : AudioAttributesCompat.a(false, this.f4606c, this.f4604a);
    }

    public int d() {
        return this.f4604a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f4605b == audioAttributesImplBase.a() && this.f4606c == audioAttributesImplBase.b() && this.f4604a == audioAttributesImplBase.d() && this.f4607d == audioAttributesImplBase.f4607d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4605b), Integer.valueOf(this.f4606c), Integer.valueOf(this.f4604a), Integer.valueOf(this.f4607d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f4607d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f4607d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.b(this.f4604a));
        sb2.append(" content=");
        sb2.append(this.f4605b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f4606c).toUpperCase());
        return sb2.toString();
    }
}
