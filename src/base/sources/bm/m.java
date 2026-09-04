package bm;

import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matcher f9140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f9141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f9142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f9143d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends gl.d {
        a() {
        }

        @Override // gl.b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return h((String) obj);
            }
            return false;
        }

        @Override // gl.b
        public int d() {
            return m.this.e().groupCount() + 1;
        }

        public /* bridge */ boolean h(String str) {
            return super.contains(str);
        }

        @Override // gl.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return m((String) obj);
            }
            return -1;
        }

        @Override // gl.d, java.util.List
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public String get(int i10) {
            String strGroup = m.this.e().group(i10);
            return strGroup == null ? "" : strGroup;
        }

        @Override // gl.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return n((String) obj);
            }
            return -1;
        }

        public /* bridge */ int m(String str) {
            return super.indexOf(str);
        }

        public /* bridge */ int n(String str) {
            return super.lastIndexOf(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends gl.b implements k {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final j m(b bVar, int i10) {
            return bVar.get(i10);
        }

        @Override // gl.b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof j) {
                return k((j) obj);
            }
            return false;
        }

        @Override // gl.b
        public int d() {
            return m.this.e().groupCount() + 1;
        }

        @Override // bm.k
        public j get(int i10) {
            yl.f fVarH = p.h(m.this.e(), i10);
            if (fVarH.m().intValue() < 0) {
                return null;
            }
            String strGroup = m.this.e().group(i10);
            kotlin.jvm.internal.s.g(strGroup, "group(...)");
            return new j(strGroup, fVarH);
        }

        @Override // gl.b, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return am.j.y(gl.r.T(gl.r.m(this)), new Function1() { // from class: bm.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m.b.m(this.f9146a, ((Integer) obj).intValue());
                }
            }).iterator();
        }

        public /* bridge */ boolean k(j jVar) {
            return super.contains(jVar);
        }
    }

    public m(Matcher matcher, CharSequence input) {
        kotlin.jvm.internal.s.h(matcher, "matcher");
        kotlin.jvm.internal.s.h(input, "input");
        this.f9140a = matcher;
        this.f9141b = input;
        this.f9142c = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult e() {
        return this.f9140a;
    }

    @Override // bm.l
    public List a() {
        if (this.f9143d == null) {
            this.f9143d = new a();
        }
        List list = this.f9143d;
        kotlin.jvm.internal.s.e(list);
        return list;
    }

    @Override // bm.l
    public yl.f b() {
        return p.g(e());
    }

    @Override // bm.l
    public k c() {
        return this.f9142c;
    }

    @Override // bm.l
    public l next() {
        int iEnd = e().end() + (e().end() == e().start() ? 1 : 0);
        if (iEnd > this.f9141b.length()) {
            return null;
        }
        Matcher matcher = this.f9140a.pattern().matcher(this.f9141b);
        kotlin.jvm.internal.s.g(matcher, "matcher(...)");
        return p.e(matcher, iEnd, this.f9141b);
    }
}
