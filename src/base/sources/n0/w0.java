package n0;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class w0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements am.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f46758a;

        a(ViewGroup viewGroup) {
            this.f46758a = viewGroup;
        }

        @Override // am.g
        public Iterator iterator() {
            return w0.c(this.f46758a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f46759a = new b();

        b() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke(View view) {
            am.g gVarA;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (gVarA = w0.a(viewGroup)) == null) {
                return null;
            }
            return gVarA.iterator();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements Iterator, ul.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f46760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f46761b;

        c(ViewGroup viewGroup) {
            this.f46761b = viewGroup;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f46761b;
            int i10 = this.f46760a;
            this.f46760a = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f46760a < this.f46761b.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f46761b;
            int i10 = this.f46760a - 1;
            this.f46760a = i10;
            viewGroup.removeViewAt(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d implements am.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f46762a;

        public d(ViewGroup viewGroup) {
            this.f46762a = viewGroup;
        }

        @Override // am.g
        public Iterator iterator() {
            return new m0(w0.a(this.f46762a).iterator(), b.f46759a);
        }
    }

    public static final am.g a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final am.g b(ViewGroup viewGroup) {
        return new d(viewGroup);
    }

    public static final Iterator c(ViewGroup viewGroup) {
        return new c(viewGroup);
    }
}
