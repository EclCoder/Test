/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001b568
 * Address  : 0001b568
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001b568(char *param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4)

{
  FILE *__s;
  char *local_2c;
  undefined4 *local_28;
  undefined4 local_c;
  undefined4 uStack_8;
  undefined4 uStack_4;
  
  __s = (FILE *)(*(int *)(DAT_0001b5e0 + 0x1b586) + 0xa8);
  local_c = param_2;
  uStack_8 = param_3;
  uStack_4 = param_4;
  fwrite((void *)(DAT_0001b5e4 + 0x1b590),0xb,1,__s);
  local_28 = &local_c;
  vfprintf(__s,param_1,&local_c);
  fputc(10,__s);
  vasprintf(&local_2c,param_1,&local_c);
  android_set_abort_message(local_2c);
  openlog((char *)(DAT_0001b5e8 + 0x1b5c8),0,0);
  syslog(2,(char *)(DAT_0001b5ec + 0x1b5d4),local_2c);
  closelog();
                    /* WARNING: Subroutine does not return */
  abort();
}


