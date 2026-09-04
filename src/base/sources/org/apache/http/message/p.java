package org.apache.http.message;

import co.z;
import java.util.NoSuchElementException;
import org.apache.http.ParseException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class p implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final co.g f49423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f49424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f49425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f49426d = b(-1);

    public p(co.g gVar) {
        this.f49423a = (co.g) ip.a.h(gVar, "Header iterator");
    }

    protected String a(String str, int i10, int i11) {
        return str.substring(i10, i11);
    }

    protected int b(int i10) {
        int iD;
        if (i10 >= 0) {
            iD = d(i10);
        } else {
            if (!this.f49423a.hasNext()) {
                return -1;
            }
            this.f49424b = this.f49423a.k().getValue();
            iD = 0;
        }
        int iE = e(iD);
        if (iE < 0) {
            this.f49425c = null;
            return -1;
        }
        int iC = c(iE);
        this.f49425c = a(this.f49424b, iE, iC);
        return iC;
    }

    protected int c(int i10) {
        ip.a.g(i10, "Search position");
        int length = this.f49424b.length();
        do {
            i10++;
            if (i10 >= length) {
                break;
            }
        } while (g(this.f49424b.charAt(i10)));
        return i10;
    }

    protected int d(int i10) {
        int iG = ip.a.g(i10, "Search position");
        int length = this.f49424b.length();
        boolean z10 = false;
        while (!z10 && iG < length) {
            char cCharAt = this.f49424b.charAt(iG);
            if (h(cCharAt)) {
                z10 = true;
            } else {
                if (!i(cCharAt)) {
                    if (g(cCharAt)) {
                        throw new ParseException("Tokens without separator (pos " + iG + "): " + this.f49424b);
                    }
                    throw new ParseException("Invalid character after token (pos " + iG + "): " + this.f49424b);
                }
                iG++;
            }
        }
        return iG;
    }

    protected int e(int i10) {
        int iG = ip.a.g(i10, "Search position");
        boolean z10 = false;
        while (!z10) {
            String str = this.f49424b;
            if (str == null) {
                break;
            }
            int length = str.length();
            while (!z10 && iG < length) {
                char cCharAt = this.f49424b.charAt(iG);
                if (h(cCharAt) || i(cCharAt)) {
                    iG++;
                } else {
                    if (!g(this.f49424b.charAt(iG))) {
                        throw new ParseException("Invalid character before token (pos " + iG + "): " + this.f49424b);
                    }
                    z10 = true;
                }
            }
            if (!z10) {
                if (this.f49423a.hasNext()) {
                    this.f49424b = this.f49423a.k().getValue();
                    iG = 0;
                } else {
                    this.f49424b = null;
                }
            }
        }
        if (z10) {
            return iG;
        }
        return -1;
    }

    protected boolean f(char c10) {
        return " ,;=()<>@:\\\"/[]?{}\t".indexOf(c10) >= 0;
    }

    protected boolean g(char c10) {
        if (Character.isLetterOrDigit(c10)) {
            return true;
        }
        return (Character.isISOControl(c10) || f(c10)) ? false : true;
    }

    protected boolean h(char c10) {
        return c10 == ',';
    }

    @Override // co.z, java.util.Iterator
    public boolean hasNext() {
        return this.f49425c != null;
    }

    protected boolean i(char c10) {
        return c10 == '\t' || Character.isSpaceChar(c10);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return nextToken();
    }

    @Override // co.z
    public String nextToken() {
        String str = this.f49425c;
        if (str == null) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.f49426d = b(this.f49426d);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Removing tokens is not supported.");
    }
}
