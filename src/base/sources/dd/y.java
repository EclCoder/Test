package dd;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class y implements ce.b, ce.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ce.a.InterfaceC0137a f36684c = new ce.a.InterfaceC0137a() { // from class: dd.v
        @Override // ce.a.InterfaceC0137a
        public final void a(ce.b bVar) {
            y.d(bVar);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ce.b f36685d = new ce.b() { // from class: dd.w
        @Override // ce.b
        public final Object get() {
            return y.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ce.a.InterfaceC0137a f36686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile ce.b f36687b;

    private y(ce.a.InterfaceC0137a interfaceC0137a, ce.b bVar) {
        this.f36686a = interfaceC0137a;
        this.f36687b = bVar;
    }

    public static /* synthetic */ Object b() {
        return null;
    }

    public static /* synthetic */ void c(ce.a.InterfaceC0137a interfaceC0137a, ce.a.InterfaceC0137a interfaceC0137a2, ce.b bVar) {
        interfaceC0137a.a(bVar);
        interfaceC0137a2.a(bVar);
    }

    static y e() {
        return new y(f36684c, f36685d);
    }

    static y f(ce.b bVar) {
        return new y(null, bVar);
    }

    @Override // ce.a
    public void a(final ce.a.InterfaceC0137a interfaceC0137a) {
        ce.b bVar;
        ce.b bVar2;
        ce.b bVar3 = this.f36687b;
        ce.b bVar4 = f36685d;
        if (bVar3 != bVar4) {
            interfaceC0137a.a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f36687b;
            if (bVar != bVar4) {
                bVar2 = bVar;
            } else {
                final ce.a.InterfaceC0137a interfaceC0137a2 = this.f36686a;
                this.f36686a = new ce.a.InterfaceC0137a() { // from class: dd.x
                    @Override // ce.a.InterfaceC0137a
                    public final void a(ce.b bVar5) {
                        y.c(interfaceC0137a2, interfaceC0137a, bVar5);
                    }
                };
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            interfaceC0137a.a(bVar);
        }
    }

    void g(ce.b bVar) {
        ce.a.InterfaceC0137a interfaceC0137a;
        if (this.f36687b != f36685d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC0137a = this.f36686a;
            this.f36686a = null;
            this.f36687b = bVar;
        }
        interfaceC0137a.a(bVar);
    }

    @Override // ce.b
    public Object get() {
        return this.f36687b.get();
    }

    public static /* synthetic */ void d(ce.b bVar) {
    }
}
