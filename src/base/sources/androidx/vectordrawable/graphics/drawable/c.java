package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import d0.h;
import d0.k;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class c extends f implements Animatable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0096c f7493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f7494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArgbEvaluator f7495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d f7496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Animator.AnimatorListener f7497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ArrayList f7498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Drawable.Callback f7499h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            c.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f7498g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i10)).b(c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f7498g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i10)).c(c.this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class C0096c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f7502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g f7503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        AnimatorSet f7504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList f7505d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        androidx.collection.a f7506e;

        public C0096c(Context context, C0096c c0096c, Drawable.Callback callback, Resources resources) {
            if (c0096c != null) {
                this.f7502a = c0096c.f7502a;
                g gVar = c0096c.f7503b;
                if (gVar != null) {
                    Drawable.ConstantState constantState = gVar.getConstantState();
                    if (resources != null) {
                        this.f7503b = (g) constantState.newDrawable(resources);
                    } else {
                        this.f7503b = (g) constantState.newDrawable();
                    }
                    g gVar2 = (g) this.f7503b.mutate();
                    this.f7503b = gVar2;
                    gVar2.setCallback(callback);
                    this.f7503b.setBounds(c0096c.f7503b.getBounds());
                    this.f7503b.g(false);
                }
                ArrayList arrayList = c0096c.f7505d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f7505d = new ArrayList(size);
                    this.f7506e = new androidx.collection.a(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = (Animator) c0096c.f7505d.get(i10);
                        Animator animatorClone = animator.clone();
                        String str = (String) c0096c.f7506e.get(animator);
                        animatorClone.setTarget(this.f7503b.c(str));
                        this.f7505d.add(animatorClone);
                        this.f7506e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f7504c == null) {
                this.f7504c = new AnimatorSet();
            }
            this.f7504c.playTogether(this.f7505d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f7502a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    c() {
        this(null, null, null);
    }

    public static c a(Context context, int i10) {
        c cVar = new c(context);
        Drawable drawableE = h.e(context.getResources(), i10, context.getTheme());
        cVar.f7508a = drawableE;
        drawableE.setCallback(cVar.f7499h);
        cVar.f7496e = new d(cVar.f7508a.getConstantState());
        return cVar;
    }

    private static void c(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        animatedVectorDrawable.registerAnimationCallback(bVar.a());
    }

    private void d() {
        Animator.AnimatorListener animatorListener = this.f7497f;
        if (animatorListener != null) {
            this.f7493b.f7504c.removeListener(animatorListener);
            this.f7497f = null;
        }
    }

    private void e(String str, Animator animator) {
        animator.setTarget(this.f7493b.f7503b.c(str));
        C0096c c0096c = this.f7493b;
        if (c0096c.f7505d == null) {
            c0096c.f7505d = new ArrayList();
            this.f7493b.f7506e = new androidx.collection.a();
        }
        this.f7493b.f7505d.add(animator);
        this.f7493b.f7506e.put(animator, str);
    }

    private static boolean g(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(bVar.a());
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            f0.a.a(drawable, theme);
        }
    }

    public void b(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            c((AnimatedVectorDrawable) drawable, bVar);
            return;
        }
        if (bVar == null) {
            return;
        }
        if (this.f7498g == null) {
            this.f7498g = new ArrayList();
        }
        if (this.f7498g.contains(bVar)) {
            return;
        }
        this.f7498g.add(bVar);
        if (this.f7497f == null) {
            this.f7497f = new b();
        }
        this.f7493b.f7504c.addListener(this.f7497f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            return f0.a.b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f7493b.f7503b.draw(canvas);
        if (this.f7493b.f7504c.isStarted()) {
            invalidateSelf();
        }
    }

    public boolean f(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            g((AnimatedVectorDrawable) drawable, bVar);
        }
        ArrayList arrayList = this.f7498g;
        if (arrayList == null || bVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(bVar);
        if (this.f7498g.size() == 0) {
            d();
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f7508a;
        return drawable != null ? f0.a.d(drawable) : this.f7493b.f7503b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f7508a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f7493b.f7502a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f7508a;
        return drawable != null ? f0.a.e(drawable) : this.f7493b.f7503b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f7508a != null) {
            return new d(this.f7508a.getConstantState());
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f7508a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f7493b.f7503b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f7508a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f7493b.f7503b.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f7508a;
        return drawable != null ? drawable.getOpacity() : this.f7493b.f7503b.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            f0.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayQ = k.q(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f7483e);
                    int resourceId = typedArrayQ.getResourceId(0, 0);
                    if (resourceId != 0) {
                        g gVarB = g.b(resources, resourceId, theme);
                        gVarB.g(false);
                        gVarB.setCallback(this.f7499h);
                        g gVar = this.f7493b.f7503b;
                        if (gVar != null) {
                            gVar.setCallback(null);
                        }
                        this.f7493b.f7503b = gVarB;
                    }
                    typedArrayQ.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f7484f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f7494c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        e(string, e.a(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f7493b.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f7508a;
        return drawable != null ? f0.a.h(drawable) : this.f7493b.f7503b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f7508a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f7493b.f7504c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f7508a;
        return drawable != null ? drawable.isStateful() : this.f7493b.f7503b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f7493b.f7503b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f7508a;
        return drawable != null ? drawable.setLevel(i10) : this.f7493b.f7503b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f7508a;
        return drawable != null ? drawable.setState(iArr) : this.f7493b.f7503b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f7493b.f7503b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            f0.a.j(drawable, z10);
        } else {
            this.f7493b.f7503b.setAutoMirrored(z10);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            f0.a.n(drawable, i10);
        } else {
            this.f7493b.f7503b.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            f0.a.o(drawable, colorStateList);
        } else {
            this.f7493b.f7503b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            f0.a.p(drawable, mode);
        } else {
            this.f7493b.f7503b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f7493b.f7503b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f7493b.f7504c.isStarted()) {
                return;
            }
            this.f7493b.f7504c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f7493b.f7504c.end();
        }
    }

    private c(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f7508a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f7493b.f7503b.setColorFilter(colorFilter);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class d extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f7507a;

        public d(Drawable.ConstantState constantState) {
            this.f7507a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f7507a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f7507a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f7507a.newDrawable();
            cVar.f7508a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f7499h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f7507a.newDrawable(resources);
            cVar.f7508a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f7499h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f7507a.newDrawable(resources, theme);
            cVar.f7508a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f7499h);
            return cVar;
        }
    }

    private c(Context context, C0096c c0096c, Resources resources) {
        this.f7495d = null;
        this.f7497f = null;
        this.f7498g = null;
        a aVar = new a();
        this.f7499h = aVar;
        this.f7494c = context;
        if (c0096c != null) {
            this.f7493b = c0096c;
        } else {
            this.f7493b = new C0096c(context, c0096c, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
