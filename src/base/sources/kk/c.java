package kk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class c extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f43432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f43433c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Boolean f43434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p f43435b;

        b() {
        }

        @Override // kk.j.a
        public j a() {
            String str = "";
            if (this.f43434a == null) {
                str = " sampleToLocalSpanStore";
            }
            if (str.isEmpty()) {
                return new c(this.f43434a.booleanValue(), this.f43435b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // kk.j.a
        public j.a b(p pVar) {
            this.f43435b = pVar;
            return this;
        }

        public j.a c(boolean z10) {
            this.f43434a = Boolean.valueOf(z10);
            return this;
        }
    }

    @Override // kk.j
    public boolean b() {
        return this.f43432b;
    }

    @Override // kk.j
    public p c() {
        return this.f43433c;
    }

    public boolean equals(Object obj) {
        p pVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f43432b == jVar.b() && ((pVar = this.f43433c) != null ? pVar.equals(jVar.c()) : jVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = ((this.f43432b ? 1231 : 1237) ^ 1000003) * 1000003;
        p pVar = this.f43433c;
        return i10 ^ (pVar == null ? 0 : pVar.hashCode());
    }

    public String toString() {
        return "EndSpanOptions{sampleToLocalSpanStore=" + this.f43432b + ", status=" + this.f43433c + "}";
    }

    private c(boolean z10, p pVar) {
        this.f43432b = z10;
        this.f43433c = pVar;
    }
}
