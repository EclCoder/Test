package hi;

import com.coremedia.iso.Hex;
import java.math.BigInteger;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f40373a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j[] f40374b = null;

    /* JADX INFO: renamed from: hi.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private abstract class AbstractC0609a implements j {
        private AbstractC0609a() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            j jVar = (j) obj;
            return clear() == jVar.clear() && a() == jVar.a();
        }

        public String toString() {
            return "P(" + clear() + "|" + a() + ")";
        }

        /* synthetic */ AbstractC0609a(a aVar, AbstractC0609a abstractC0609a) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class b extends AbstractC0609a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte f40376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte f40377c;

        public b(int i10, long j10) {
            super(a.this, null);
            this.f40376b = (byte) i10;
            this.f40377c = (byte) j10;
        }

        @Override // hi.a.j
        public long a() {
            return this.f40377c;
        }

        @Override // hi.a.j
        public int clear() {
            return this.f40376b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class c extends AbstractC0609a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte f40379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f40380c;

        public c(int i10, long j10) {
            super(a.this, null);
            this.f40379b = (byte) i10;
            this.f40380c = (int) j10;
        }

        @Override // hi.a.j
        public long a() {
            return this.f40380c;
        }

        @Override // hi.a.j
        public int clear() {
            return this.f40379b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class d extends AbstractC0609a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte f40382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f40383c;

        public d(int i10, long j10) {
            super(a.this, null);
            this.f40382b = (byte) i10;
            this.f40383c = j10;
        }

        @Override // hi.a.j
        public long a() {
            return this.f40383c;
        }

        @Override // hi.a.j
        public int clear() {
            return this.f40382b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class e extends AbstractC0609a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte f40385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private short f40386c;

        public e(int i10, long j10) {
            super(a.this, null);
            this.f40385b = (byte) i10;
            this.f40386c = (short) j10;
        }

        @Override // hi.a.j
        public long a() {
            return this.f40386c;
        }

        @Override // hi.a.j
        public int clear() {
            return this.f40385b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class f extends AbstractC0609a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f40388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte f40389c;

        public f(int i10, long j10) {
            super(a.this, null);
            this.f40388b = i10;
            this.f40389c = (byte) j10;
        }

        @Override // hi.a.j
        public long a() {
            return this.f40389c;
        }

        @Override // hi.a.j
        public int clear() {
            return this.f40388b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class g extends AbstractC0609a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f40391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f40392c;

        public g(int i10, long j10) {
            super(a.this, null);
            this.f40391b = i10;
            this.f40392c = (int) j10;
        }

        @Override // hi.a.j
        public long a() {
            return this.f40392c;
        }

        @Override // hi.a.j
        public int clear() {
            return this.f40391b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class h extends AbstractC0609a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f40394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f40395c;

        public h(int i10, long j10) {
            super(a.this, null);
            this.f40394b = i10;
            this.f40395c = j10;
        }

        @Override // hi.a.j
        public long a() {
            return this.f40395c;
        }

        @Override // hi.a.j
        public int clear() {
            return this.f40394b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class i extends AbstractC0609a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f40397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private short f40398c;

        public i(int i10, long j10) {
            super(a.this, null);
            this.f40397b = i10;
            this.f40398c = (short) j10;
        }

        @Override // hi.a.j
        public long a() {
            return this.f40398c;
        }

        @Override // hi.a.j
        public int clear() {
            return this.f40397b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface j {
        long a();

        int clear();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class k extends AbstractC0609a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private short f40400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte f40401c;

        public k(int i10, long j10) {
            super(a.this, null);
            this.f40400b = (short) i10;
            this.f40401c = (byte) j10;
        }

        @Override // hi.a.j
        public long a() {
            return this.f40401c;
        }

        @Override // hi.a.j
        public int clear() {
            return this.f40400b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class l extends AbstractC0609a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private short f40403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f40404c;

        public l(int i10, long j10) {
            super(a.this, null);
            this.f40403b = (short) i10;
            this.f40404c = (int) j10;
        }

        @Override // hi.a.j
        public long a() {
            return this.f40404c;
        }

        @Override // hi.a.j
        public int clear() {
            return this.f40403b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class m extends AbstractC0609a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private short f40406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f40407c;

        public m(int i10, long j10) {
            super(a.this, null);
            this.f40406b = (short) i10;
            this.f40407c = j10;
        }

        @Override // hi.a.j
        public long a() {
            return this.f40407c;
        }

        @Override // hi.a.j
        public int clear() {
            return this.f40406b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class n extends AbstractC0609a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private short f40409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private short f40410c;

        public n(int i10, long j10) {
            super(a.this, null);
            this.f40409b = (short) i10;
            this.f40410c = (short) j10;
        }

        @Override // hi.a.j
        public long a() {
            return this.f40410c;
        }

        @Override // hi.a.j
        public int clear() {
            return this.f40409b;
        }
    }

    public j a(int i10, long j10) {
        if (i10 <= 127) {
            if (j10 <= 127) {
                return new b(i10, j10);
            }
            if (j10 <= 32767) {
                return new e(i10, j10);
            }
            return j10 <= 2147483647L ? new c(i10, j10) : new d(i10, j10);
        }
        if (i10 <= 32767) {
            if (j10 <= 127) {
                return new k(i10, j10);
            }
            if (j10 <= 32767) {
                return new n(i10, j10);
            }
            return j10 <= 2147483647L ? new l(i10, j10) : new m(i10, j10);
        }
        if (j10 <= 127) {
            return new f(i10, j10);
        }
        if (j10 <= 32767) {
            return new i(i10, j10);
        }
        return j10 <= 2147483647L ? new g(i10, j10) : new h(i10, j10);
    }

    public int b() {
        int length = this.f40373a.length;
        j[] jVarArr = this.f40374b;
        return (jVarArr == null || jVarArr.length <= 0) ? length : length + 2 + (jVarArr.length * 6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (!new BigInteger(this.f40373a).equals(new BigInteger(aVar.f40373a))) {
            return false;
        }
        j[] jVarArr = this.f40374b;
        j[] jVarArr2 = aVar.f40374b;
        return jVarArr == null ? jVarArr2 == null : Arrays.equals(jVarArr, jVarArr2);
    }

    public int hashCode() {
        byte[] bArr = this.f40373a;
        int iHashCode = (bArr != null ? Arrays.hashCode(bArr) : 0) * 31;
        j[] jVarArr = this.f40374b;
        return iHashCode + (jVarArr != null ? Arrays.hashCode(jVarArr) : 0);
    }

    public String toString() {
        return "Entry{iv=" + Hex.encodeHex(this.f40373a) + ", pairs=" + Arrays.toString(this.f40374b) + '}';
    }
}
