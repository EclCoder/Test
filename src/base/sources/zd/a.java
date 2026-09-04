package zd;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f58793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d.a f58794b = d.a.DEFAULT;

    /* JADX INFO: renamed from: zd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0901a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f58795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d.a f58796b;

        C0901a(int i10, d.a aVar) {
            this.f58795a = i10;
            this.f58796b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f58795a == dVar.tag() && this.f58796b.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f58795a) + (this.f58796b.hashCode() ^ 2041407134);
        }

        @Override // zd.d
        public d.a intEncoding() {
            return this.f58796b;
        }

        @Override // zd.d
        public int tag() {
            return this.f58795a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f58795a + "intEncoding=" + this.f58796b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0901a(this.f58793a, this.f58794b);
    }

    public a c(int i10) {
        this.f58793a = i10;
        return this;
    }
}
