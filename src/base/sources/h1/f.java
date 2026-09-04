package h1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f40149a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextView f40150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f40151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f40152c = true;

        a(TextView textView) {
            this.f40150a = textView;
            this.f40151b = new d(textView);
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f40151b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f40151b;
            return inputFilterArr2;
        }

        private SparseArray g(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray sparseArrayG = g(inputFilterArr);
            if (sparseArrayG.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayG.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArrayG.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void k() {
            this.f40150a.setFilters(a(this.f40150a.getFilters()));
        }

        private TransformationMethod m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }

        @Override // h1.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f40152c ? h(inputFilterArr) : f(inputFilterArr);
        }

        @Override // h1.f.b
        public boolean b() {
            return this.f40152c;
        }

        @Override // h1.f.b
        void c(boolean z10) {
            if (z10) {
                l();
            }
        }

        @Override // h1.f.b
        void d(boolean z10) {
            this.f40152c = z10;
            l();
            k();
        }

        @Override // h1.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f40152c ? m(transformationMethod) : j(transformationMethod);
        }

        void i(boolean z10) {
            this.f40152c = z10;
        }

        void l() {
            this.f40150a.setTransformationMethod(e(this.f40150a.getTransformationMethod()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {
        b() {
        }

        abstract InputFilter[] a(InputFilter[] inputFilterArr);

        public abstract boolean b();

        abstract void c(boolean z10);

        abstract void d(boolean z10);

        abstract TransformationMethod e(TransformationMethod transformationMethod);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f40153a;

        c(TextView textView) {
            this.f40153a = new a(textView);
        }

        private boolean f() {
            return !androidx.emoji2.text.e.i();
        }

        @Override // h1.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f40153a.a(inputFilterArr);
        }

        @Override // h1.f.b
        public boolean b() {
            return this.f40153a.b();
        }

        @Override // h1.f.b
        void c(boolean z10) {
            if (f()) {
                return;
            }
            this.f40153a.c(z10);
        }

        @Override // h1.f.b
        void d(boolean z10) {
            if (f()) {
                this.f40153a.i(z10);
            } else {
                this.f40153a.d(z10);
            }
        }

        @Override // h1.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f40153a.e(transformationMethod);
        }
    }

    public f(TextView textView, boolean z10) {
        m0.g.h(textView, "textView cannot be null");
        if (z10) {
            this.f40149a = new a(textView);
        } else {
            this.f40149a = new c(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f40149a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f40149a.b();
    }

    public void c(boolean z10) {
        this.f40149a.c(z10);
    }

    public void d(boolean z10) {
        this.f40149a.d(z10);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f40149a.e(transformationMethod);
    }
}
