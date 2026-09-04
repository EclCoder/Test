package i5;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.h f41031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k4.a f41032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k4.d f41033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k4.d f41034d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends k4.a {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // k4.d
        public String d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // k4.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(p4.f fVar, m mVar) throws Throwable {
            String str = mVar.f41029a;
            if (str == null) {
                fVar.E0(1);
            } else {
                fVar.h0(1, str);
            }
            byte[] bArrK = androidx.work.e.k(mVar.f41030b);
            if (bArrK == null) {
                fVar.E0(2);
            } else {
                fVar.u0(2, bArrK);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends k4.d {
        b(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // k4.d
        public String d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends k4.d {
        c(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // k4.d
        public String d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(androidx.room.h hVar) {
        this.f41031a = hVar;
        this.f41032b = new a(hVar);
        this.f41033c = new b(hVar);
        this.f41034d = new c(hVar);
    }

    @Override // i5.n
    public void a(m mVar) {
        this.f41031a.b();
        this.f41031a.c();
        try {
            this.f41032b.h(mVar);
            this.f41031a.r();
        } finally {
            this.f41031a.g();
        }
    }

    @Override // i5.n
    public void b() {
        this.f41031a.b();
        p4.f fVarA = this.f41034d.a();
        this.f41031a.c();
        try {
            fVarA.E();
            this.f41031a.r();
        } finally {
            this.f41031a.g();
            this.f41034d.f(fVarA);
        }
    }

    @Override // i5.n
    public void delete(String str) {
        this.f41031a.b();
        p4.f fVarA = this.f41033c.a();
        if (str == null) {
            fVarA.E0(1);
        } else {
            fVarA.h0(1, str);
        }
        this.f41031a.c();
        try {
            fVarA.E();
            this.f41031a.r();
        } finally {
            this.f41031a.g();
            this.f41033c.f(fVarA);
        }
    }
}
