package am;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r extends p {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements Iterable, ul.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f446a;

        public a(g gVar) {
            this.f446a = gVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f446a.iterator();
        }
    }

    public static g A(g gVar, Function1 predicate) {
        kotlin.jvm.internal.s.h(gVar, "<this>");
        kotlin.jvm.internal.s.h(predicate, "predicate");
        return new s(gVar, predicate);
    }

    public static List B(g gVar) {
        kotlin.jvm.internal.s.h(gVar, "<this>");
        Iterator it = gVar.iterator();
        if (!it.hasNext()) {
            return gl.r.l();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return gl.r.e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Iterable l(g gVar) {
        kotlin.jvm.internal.s.h(gVar, "<this>");
        return new a(gVar);
    }

    public static boolean m(g gVar, Object obj) {
        kotlin.jvm.internal.s.h(gVar, "<this>");
        return t(gVar, obj) >= 0;
    }

    public static g n(g gVar, int i10) {
        kotlin.jvm.internal.s.h(gVar, "<this>");
        if (i10 >= 0) {
            if (i10 == 0) {
                return gVar;
            }
            return gVar instanceof c ? ((c) gVar).a(i10) : new b(gVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static g o(g gVar, Function1 predicate) {
        kotlin.jvm.internal.s.h(gVar, "<this>");
        kotlin.jvm.internal.s.h(predicate, "predicate");
        return new e(gVar, true, predicate);
    }

    public static g p(g gVar, Function1 predicate) {
        kotlin.jvm.internal.s.h(gVar, "<this>");
        kotlin.jvm.internal.s.h(predicate, "predicate");
        return new e(gVar, false, predicate);
    }

    public static g q(g gVar) {
        kotlin.jvm.internal.s.h(gVar, "<this>");
        g gVarP = p(gVar, new Function1() { // from class: am.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(r.r(obj));
            }
        });
        kotlin.jvm.internal.s.f(gVarP, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return gVarP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(Object obj) {
        return obj == null;
    }

    public static Object s(g gVar) {
        kotlin.jvm.internal.s.h(gVar, "<this>");
        Iterator it = gVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final int t(g gVar, Object obj) {
        kotlin.jvm.internal.s.h(gVar, "<this>");
        int i10 = 0;
        for (Object obj2 : gVar) {
            if (i10 < 0) {
                gl.r.u();
            }
            if (kotlin.jvm.internal.s.c(obj, obj2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final Appendable u(g gVar, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) throws IOException {
        kotlin.jvm.internal.s.h(gVar, "<this>");
        kotlin.jvm.internal.s.h(buffer, "buffer");
        kotlin.jvm.internal.s.h(separator, "separator");
        kotlin.jvm.internal.s.h(prefix, "prefix");
        kotlin.jvm.internal.s.h(postfix, "postfix");
        kotlin.jvm.internal.s.h(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : gVar) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            bm.r.a(buffer, obj, function1);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String v(g gVar, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) {
        kotlin.jvm.internal.s.h(gVar, "<this>");
        kotlin.jvm.internal.s.h(separator, "separator");
        kotlin.jvm.internal.s.h(prefix, "prefix");
        kotlin.jvm.internal.s.h(postfix, "postfix");
        kotlin.jvm.internal.s.h(truncated, "truncated");
        return ((StringBuilder) u(gVar, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
    }

    public static /* synthetic */ String w(g gVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function2 = function1;
        return v(gVar, charSequence, charSequence2, charSequence3, i10, charSequence5, function2);
    }

    public static Object x(g gVar) {
        kotlin.jvm.internal.s.h(gVar, "<this>");
        Iterator it = gVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static g y(g gVar, Function1 transform) {
        kotlin.jvm.internal.s.h(gVar, "<this>");
        kotlin.jvm.internal.s.h(transform, "transform");
        return new t(gVar, transform);
    }

    public static g z(g gVar, Function1 transform) {
        kotlin.jvm.internal.s.h(gVar, "<this>");
        kotlin.jvm.internal.s.h(transform, "transform");
        return q(new t(gVar, transform));
    }
}
