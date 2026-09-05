// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 741-760
// ============================================================

// ============================================================
// Function #741
// Name: __aeabi_memmove4
// Address: 000a05c0
// JNI: NO
// ============================================================


void __aeabi_memmove4(void)

{
  (*(code *)PTR___aeabi_memmove4_000a5f00)();
  return;
}




// ============================================================
// Function #742
// Name: __aeabi_memcpy
// Address: 000a05d0
// JNI: NO
// ============================================================


void __aeabi_memcpy(void)

{
  (*(code *)PTR___aeabi_memcpy_000a5f04)();
  return;
}




// ============================================================
// Function #743
// Name: pthread_cond_wait
// Address: 000a05e0
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_cond_wait(pthread_cond_t *__cond,pthread_mutex_t *__mutex)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_pthread_cond_wait_000a5f08)(__cond);
  return iVar1;
}




// ============================================================
// Function #744
// Name: pthread_cond_destroy
// Address: 000a05f0
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_cond_destroy(pthread_cond_t *__cond)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_pthread_cond_destroy_000a5f0c)(__cond);
  return iVar1;
}




// ============================================================
// Function #745
// Name: snprintf
// Address: 000a0600
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int snprintf(char *__s,size_t __maxlen,char *__format,...)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_snprintf_000a5f10)(__s);
  return iVar1;
}




// ============================================================
// Function #746
// Name: remove
// Address: 000a0610
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int remove(char *__filename)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_remove_000a5f14)(__filename);
  return iVar1;
}




// ============================================================
// Function #747
// Name: android_set_abort_message
// Address: 000a0620
// JNI: NO
// ============================================================


void android_set_abort_message(void)

{
  (*(code *)PTR_android_set_abort_message_000a5f18)();
  return;
}




// ============================================================
// Function #748
// Name: openlog
// Address: 000a0630
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void openlog(char *__ident,int __option,int __facility)

{
  (*(code *)PTR_openlog_000a5f1c)(__ident);
  return;
}




// ============================================================
// Function #749
// Name: memcmp
// Address: 000a0640
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int memcmp(void *__s1,void *__s2,size_t __n)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_memcmp_000a5f20)(__s1);
  return iVar1;
}




// ============================================================
// Function #750
// Name: pthread_setspecific
// Address: 000a0650
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_setspecific(pthread_key_t __key,void *__pointer)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_pthread_setspecific_000a5f24)(__key);
  return iVar1;
}




// ============================================================
// Function #751
// Name: memset
// Address: 000a0660
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * memset(void *__s,int __c,size_t __n)

{
  void *pvVar1;
  
  pvVar1 = (void *)(*(code *)PTR_memset_000a5f28)(__s);
  return pvVar1;
}




// ============================================================
// Function #752
// Name: vfprintf
// Address: 000a0670
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int vfprintf(FILE *__s,char *__format,__gnuc_va_list __arg)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_vfprintf_000a5f2c)(__s);
  return iVar1;
}




// ============================================================
// Function #753
// Name: posix_memalign
// Address: 000a06a0
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int posix_memalign(void **__memptr,size_t __alignment,size_t __size)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_posix_memalign_000a5f38)(__memptr);
  return iVar1;
}




// ============================================================
// Function #754
// Name: readdir
// Address: 000a06b0
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

dirent * readdir(DIR *__dirp)

{
  dirent *pdVar1;
  
  pdVar1 = (dirent *)(*(code *)PTR_readdir_000a5f3c)(__dirp);
  return pdVar1;
}




// ============================================================
// Function #755
// Name: pthread_key_delete
// Address: 000a06c0
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_key_delete(pthread_key_t __key)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_pthread_key_delete_000a5f40)(__key);
  return iVar1;
}




// ============================================================
// Function #756
// Name: __errno
// Address: 000a06e0
// JNI: NO
// ============================================================


void __errno(void)

{
  (*(code *)PTR___errno_000a5f48)();
  return;
}




// ============================================================
// Function #757
// Name: getpid
// Address: 000a06f0
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

__pid_t getpid(void)

{
  __pid_t _Var1;
  
  _Var1 = (*(code *)PTR_getpid_000a5f4c)();
  return _Var1;
}




// ============================================================
// Function #758
// Name: __system_property_read
// Address: 000a0700
// JNI: NO
// ============================================================


void __system_property_read(void)

{
  (*(code *)PTR___system_property_read_000a5f50)();
  return;
}




// ============================================================
// Function #759
// Name: closelog
// Address: 000a0710
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void closelog(void)

{
  (*(code *)PTR_closelog_000a5f54)();
  return;
}




// ============================================================
// Function #760
// Name: pthread_key_create
// Address: 000a0720
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_key_create(pthread_key_t *__key,__destr_function *__destr_function)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_pthread_key_create_000a5f58)(__key);
  return iVar1;
}




