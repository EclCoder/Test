package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class FileContent extends AbstractInputStreamContent {
    private final File file;

    public FileContent(String str, File file) {
        super(str);
        this.file = (File) Preconditions.checkNotNull(file);
    }

    public File getFile() {
        return this.file;
    }

    @Override // com.google.api.client.http.AbstractInputStreamContent
    public InputStream getInputStream() {
        return new FileInputStream(this.file);
    }

    @Override // com.google.api.client.http.HttpContent
    public long getLength() {
        return this.file.length();
    }

    @Override // com.google.api.client.http.HttpContent
    public boolean retrySupported() {
        return true;
    }

    @Override // com.google.api.client.http.AbstractInputStreamContent
    public FileContent setCloseInputStream(boolean z10) {
        return (FileContent) super.setCloseInputStream(z10);
    }

    @Override // com.google.api.client.http.AbstractInputStreamContent
    public FileContent setType(String str) {
        return (FileContent) super.setType(str);
    }
}
