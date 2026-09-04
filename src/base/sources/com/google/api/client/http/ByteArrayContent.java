package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ByteArrayContent extends AbstractInputStreamContent {
    private final byte[] byteArray;
    private final int length;
    private final int offset;

    public ByteArrayContent(String str, byte[] bArr) {
        this(str, bArr, 0, bArr.length);
    }

    public static ByteArrayContent fromString(String str, String str2) {
        return new ByteArrayContent(str, StringUtils.getBytesUtf8(str2));
    }

    @Override // com.google.api.client.http.AbstractInputStreamContent
    public InputStream getInputStream() {
        return new ByteArrayInputStream(this.byteArray, this.offset, this.length);
    }

    @Override // com.google.api.client.http.HttpContent
    public long getLength() {
        return this.length;
    }

    @Override // com.google.api.client.http.HttpContent
    public boolean retrySupported() {
        return true;
    }

    public ByteArrayContent(String str, byte[] bArr, int i10, int i11) {
        super(str);
        this.byteArray = (byte[]) Preconditions.checkNotNull(bArr);
        Preconditions.checkArgument(i10 >= 0 && i11 >= 0 && i10 + i11 <= bArr.length, "offset %s, length %s, array length %s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(bArr.length));
        this.offset = i10;
        this.length = i11;
    }

    @Override // com.google.api.client.http.AbstractInputStreamContent
    public ByteArrayContent setCloseInputStream(boolean z10) {
        return (ByteArrayContent) super.setCloseInputStream(z10);
    }

    @Override // com.google.api.client.http.AbstractInputStreamContent
    public ByteArrayContent setType(String str) {
        return (ByteArrayContent) super.setType(str);
    }
}
