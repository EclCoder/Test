package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class y implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final f0 f4326a;

    y(f0 f0Var) {
        this.f4326a = f0Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        m0 m0VarY;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f4326a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i1.c.f40742a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(i1.c.f40743b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(i1.c.f40744c, -1);
        String string = typedArrayObtainStyledAttributes.getString(i1.c.f40745d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !w.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id2 = view != null ? view.getId() : 0;
        if (id2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentJ0 = resourceId != -1 ? this.f4326a.j0(resourceId) : null;
        if (fragmentJ0 == null && string != null) {
            fragmentJ0 = this.f4326a.k0(string);
        }
        if (fragmentJ0 == null && id2 != -1) {
            fragmentJ0 = this.f4326a.j0(id2);
        }
        if (fragmentJ0 == null) {
            fragmentJ0 = this.f4326a.x0().a(context.getClassLoader(), attributeValue);
            fragmentJ0.mFromLayout = true;
            fragmentJ0.mFragmentId = resourceId != 0 ? resourceId : id2;
            fragmentJ0.mContainerId = id2;
            fragmentJ0.mTag = string;
            fragmentJ0.mInLayout = true;
            f0 f0Var = this.f4326a;
            fragmentJ0.mFragmentManager = f0Var;
            fragmentJ0.mHost = f0Var.A0();
            fragmentJ0.onInflate(this.f4326a.A0().f(), attributeSet, fragmentJ0.mSavedFragmentState);
            m0VarY = this.f4326a.j(fragmentJ0);
            if (f0.N0(2)) {
                Log.v("FragmentManager", "Fragment " + fragmentJ0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (fragmentJ0.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
            }
            fragmentJ0.mInLayout = true;
            f0 f0Var2 = this.f4326a;
            fragmentJ0.mFragmentManager = f0Var2;
            fragmentJ0.mHost = f0Var2.A0();
            fragmentJ0.onInflate(this.f4326a.A0().f(), attributeSet, fragmentJ0.mSavedFragmentState);
            m0VarY = this.f4326a.y(fragmentJ0);
            if (f0.N0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + fragmentJ0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        j1.b.g(fragmentJ0, viewGroup);
        fragmentJ0.mContainer = viewGroup;
        m0VarY.m();
        m0VarY.j();
        View view2 = fragmentJ0.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentJ0.mView.getTag() == null) {
            fragmentJ0.mView.setTag(string);
        }
        fragmentJ0.mView.addOnAttachStateChangeListener(new a(m0VarY));
        return fragmentJ0.mView;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f4327a;

        a(m0 m0Var) {
            this.f4327a = m0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentK = this.f4327a.k();
            this.f4327a.m();
            x0.r((ViewGroup) fragmentK.mView.getParent(), y.this.f4326a).n();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
