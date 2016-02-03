package com.google.gcloud.storage.contrib.nio;

import static com.google.gcloud.storage.contrib.nio.CloudStorageFileSystem.FILE_TIME_UNKNOWN;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;

import java.nio.file.attribute.FileTime;

/** Metadata for a cloud storage pseudo-directory. */
final class CloudStoragePseudoDirectoryAttributes implements CloudStorageFileAttributes {

  static final CloudStoragePseudoDirectoryAttributes SINGLETON_INSTANCE =
      new CloudStoragePseudoDirectoryAttributes();

  @Override
  public boolean isDirectory() {
    return true;
  }

  @Override
  public boolean isOther() {
    return false;
  }

  @Override
  public boolean isRegularFile() {
    return false;
  }

  @Override
  public boolean isSymbolicLink() {
    return false;
  }

  @Override
  public Object fileKey() {
    return null;
  }

  @Override
  public long size() {
    return 1;  // Allow I/O to happen before we fail.
  }

  @Override
  public FileTime lastModifiedTime() {
    return FILE_TIME_UNKNOWN;
  }

  @Override
  public FileTime creationTime() {
    return FILE_TIME_UNKNOWN;
  }

  @Override
  public FileTime lastAccessTime() {
    return FILE_TIME_UNKNOWN;
  }

  @Override
  public Optional<String> etag() {
    return Optional.absent();
  }

  @Override
  public Optional<String> mimeType() {
    return Optional.absent();
  }

  @Override
  public Optional<String> acl() {
    return Optional.absent();
  }

  @Override
  public Optional<String> cacheControl() {
    return Optional.absent();
  }

  @Override
  public Optional<String> contentEncoding() {
    return Optional.absent();
  }

  @Override
  public Optional<String> contentDisposition() {
    return Optional.absent();
  }

  @Override
  public ImmutableMap<String, String> userMetadata() {
    return ImmutableMap.of();
  }

  private CloudStoragePseudoDirectoryAttributes() {}
}