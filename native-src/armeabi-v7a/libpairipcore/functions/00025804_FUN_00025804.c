/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00025804
 * Address  : 00025804
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00025804(undefined *param_1)

{
  int iVar1;
  ushort *puVar2;
  ushort *puVar3;
  ushort uVar4;
  int iVar5;
  ushort *puVar6;
  ushort *puVar7;
  ushort *puVar8;
  pthread_mutex_t *local_24;
  
  iVar1 = DAT_000258c4;
  if ((param_1 < (undefined *)(DAT_00025828 + 0x2580e)) || (&UNK_00025a0e + DAT_00025828 <= param_1)
     ) {
    (*(code *)PTR_free_000a5f80)();
    return;
  }
  local_24 = (pthread_mutex_t *)(DAT_000258c4 + 0x2583c);
  pthread_mutex_lock(local_24);
  puVar7 = *(ushort **)(iVar1 + 0x25840);
  puVar3 = (ushort *)(param_1 + -4);
  iVar5 = DAT_000258c8 + 0x25856;
  puVar2 = puVar7;
  puVar8 = (ushort *)0x0;
  do {
    puVar6 = puVar2;
    if ((puVar6 == (ushort *)0x0) || (puVar6 == (ushort *)(&UNK_00025a56 + DAT_000258c8))) {
      *(ushort **)(iVar1 + 0x25840) = puVar3;
      uVar4 = (ushort)((uint)((int)puVar7 - iVar5) >> 2);
LAB_000258b4:
      *puVar3 = uVar4;
LAB_000258b6:
      FUN_000258cc(&local_24);
      return;
    }
    uVar4 = puVar6[1];
    if (puVar6 + (uint)uVar4 * 2 == puVar3) {
      puVar6[1] = *(short *)(param_1 + -2) + uVar4;
      goto LAB_000258b6;
    }
    if (puVar3 + (uint)*(ushort *)(param_1 + -2) * 2 == puVar6) {
      *(ushort *)(param_1 + -2) = *(ushort *)(param_1 + -2) + uVar4;
      if (puVar8 != (ushort *)0x0) {
        *puVar8 = (ushort)((uint)((int)puVar3 - iVar5) >> 2);
        goto LAB_000258b6;
      }
      *(ushort **)(iVar1 + 0x25840) = puVar3;
      uVar4 = *puVar6;
      goto LAB_000258b4;
    }
    puVar2 = (ushort *)(iVar5 + (uint)*puVar6 * 4);
    puVar8 = puVar6;
  } while( true );
}


