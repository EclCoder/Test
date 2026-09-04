package sc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sc.d f52311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f52312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f52313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f52314d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ sc.d f52315a;

        /* JADX INFO: renamed from: sc.t$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0801a extends d {
            C0801a(t tVar, CharSequence charSequence) {
                super(tVar, charSequence);
            }

            @Override // sc.t.d
            int e(int i10) {
                return i10 + 1;
            }

            @Override // sc.t.d
            int f(int i10) {
                return a.this.f52315a.c(this.f52321c, i10);
            }
        }

        a(sc.d dVar) {
            this.f52315a = dVar;
        }

        @Override // sc.t.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(t tVar, CharSequence charSequence) {
            return new C0801a(tVar, charSequence);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f52317a;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a extends d {
            a(t tVar, CharSequence charSequence) {
                super(tVar, charSequence);
            }

            @Override // sc.t.d
            public int e(int i10) {
                return i10 + b.this.f52317a.length();
            }

            @Override // sc.t.d
            public int f(int i10) {
                int length = b.this.f52317a.length();
                int length2 = this.f52321c.length() - length;
                while (i10 <= length2) {
                    for (int i11 = 0; i11 < length; i11++) {
                        if (this.f52321c.charAt(i11 + i10) != b.this.f52317a.charAt(i11)) {
                            i10++;
                        }
                    }
                    return i10;
                }
                return -1;
            }
        }

        b(String str) {
            this.f52317a = str;
        }

        @Override // sc.t.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(t tVar, CharSequence charSequence) {
            return new a(tVar, charSequence);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements Iterable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f52319a;

        c(CharSequence charSequence) {
            this.f52319a = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return t.this.k(this.f52319a);
        }

        public String toString() {
            i iVarG = i.g(", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            StringBuilder sbB = iVarG.b(sb2, this);
            sbB.append(']');
            return sbB.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static abstract class d extends sc.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final CharSequence f52321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final sc.d f52322d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f52323e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f52324f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f52325g;

        protected d(t tVar, CharSequence charSequence) {
            this.f52322d = tVar.f52311a;
            this.f52323e = tVar.f52312b;
            this.f52325g = tVar.f52314d;
            this.f52321c = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // sc.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a() {
            int i10 = this.f52324f;
            while (true) {
                int i11 = this.f52324f;
                if (i11 == -1) {
                    return (String) b();
                }
                int iF = f(i11);
                if (iF == -1) {
                    iF = this.f52321c.length();
                    this.f52324f = -1;
                } else {
                    this.f52324f = e(iF);
                }
                int i12 = this.f52324f;
                if (i12 == i10) {
                    int i13 = i12 + 1;
                    this.f52324f = i13;
                    if (i13 > this.f52321c.length()) {
                        this.f52324f = -1;
                    }
                } else {
                    while (i10 < iF && this.f52322d.e(this.f52321c.charAt(i10))) {
                        i10++;
                    }
                    while (iF > i10 && this.f52322d.e(this.f52321c.charAt(iF - 1))) {
                        iF--;
                    }
                    if (!this.f52323e || i10 != iF) {
                        int i14 = this.f52325g;
                        if (i14 == 1) {
                            iF = this.f52321c.length();
                            this.f52324f = -1;
                            while (iF > i10 && this.f52322d.e(this.f52321c.charAt(iF - 1))) {
                                iF--;
                            }
                        } else {
                            this.f52325g = i14 - 1;
                        }
                        return this.f52321c.subSequence(i10, iF).toString();
                    }
                    i10 = this.f52324f;
                }
            }
        }

        abstract int e(int i10);

        abstract int f(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface e {
        Iterator a(t tVar, CharSequence charSequence);
    }

    private t(e eVar) {
        this(eVar, false, sc.d.f(), Integer.MAX_VALUE);
    }

    public static t f(char c10) {
        return h(sc.d.d(c10));
    }

    public static t g(String str) {
        p.e(str.length() != 0, "The separator may not be the empty string.");
        return str.length() == 1 ? f(str.charAt(0)) : new t(new b(str));
    }

    public static t h(sc.d dVar) {
        p.o(dVar);
        return new t(new a(dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Iterator k(CharSequence charSequence) {
        return this.f52313c.a(this, charSequence);
    }

    public t e() {
        return new t(this.f52313c, true, this.f52311a, this.f52314d);
    }

    public Iterable i(CharSequence charSequence) {
        p.o(charSequence);
        return new c(charSequence);
    }

    public List j(CharSequence charSequence) {
        p.o(charSequence);
        Iterator itK = k(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itK.hasNext()) {
            arrayList.add((String) itK.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    private t(e eVar, boolean z10, sc.d dVar, int i10) {
        this.f52313c = eVar;
        this.f52312b = z10;
        this.f52311a = dVar;
        this.f52314d = i10;
    }
}
