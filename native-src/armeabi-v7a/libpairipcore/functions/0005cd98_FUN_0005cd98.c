/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0005cd98
 * Address  : 0005cd98
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0005cd98(void)

{
  undefined4 *puVar1;
  undefined4 uVar2;
  uint uVar3;
  undefined4 local_20;
  undefined1 local_1c;
  undefined1 local_1b;
  undefined1 local_1a;
  undefined1 local_19;
  uint local_18;
  int local_14;
  
  local_14 = **(int **)(DAT_0005cea4 + 0x5cdac);
  puVar1 = (undefined4 *)FUN_000a0398(7);
  *puVar1 = 0;
  *(undefined1 *)puVar1 = 100;
  *(undefined1 *)((int)puVar1 + 1) = 0x6c;
  *(undefined4 *)((int)puVar1 + 3) = 0;
  *(undefined1 *)((int)puVar1 + 2) = 0x76;
  *(undefined1 *)((int)puVar1 + 3) = 0x73;
  *(undefined1 *)(puVar1 + 1) = 0x79;
  *(undefined1 *)((int)puVar1 + 5) = 0x6d;
  *(undefined1 *)((int)puVar1 + 6) = 0;
  local_1c = *(undefined1 *)((int)puVar1 + 3);
  local_1b = *(undefined1 *)(puVar1 + 1);
  local_1a = *(undefined1 *)((int)puVar1 + 5);
  local_20 = CONCAT13(*(undefined1 *)((int)puVar1 + 2),
                      CONCAT12(*(undefined1 *)((int)puVar1 + 1),CONCAT11(*(undefined1 *)puVar1,0xc))
                     );
  local_19 = 0;
  FUN_00023f74();
  uVar3 = local_18;
  if ((local_20 & 1) == 0) {
    uVar3 = (uint)&local_20 | 1;
  }
  uVar2 = dlsym(0xffffffff,uVar3);
  if ((local_20 & 1) != 0) {
    FUN_00023f68(local_18,local_20 & 0xfffffffe);
  }
  if (**(int **)(DAT_0005cea8 + 0x5ce90) != local_14) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar2);
  }
  return;
}


