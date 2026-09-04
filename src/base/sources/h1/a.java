package h1;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f40133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40134b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40135c = 0;

    /* JADX INFO: renamed from: h1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class C0599a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EditText f40136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f40137b;

        C0599a(EditText editText, boolean z10) {
            this.f40136a = editText;
            g gVar = new g(editText, z10);
            this.f40137b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(h1.b.getInstance());
        }

        @Override // h1.a.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // h1.a.b
        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f40136a, inputConnection, editorInfo);
        }

        @Override // h1.a.b
        void c(boolean z10) {
            this.f40137b.c(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {
        b() {
        }

        abstract KeyListener a(KeyListener keyListener);

        abstract InputConnection b(InputConnection inputConnection, EditorInfo editorInfo);

        abstract void c(boolean z10);
    }

    public a(EditText editText, boolean z10) {
        m0.g.h(editText, "editText cannot be null");
        this.f40133a = new C0599a(editText, z10);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f40133a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f40133a.b(inputConnection, editorInfo);
    }

    public void c(boolean z10) {
        this.f40133a.c(z10);
    }
}
