package test.java;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import main.java.SortAlgos;
import main.java.Item;

public class AlgoTest {

	Item i0 = new Item(0);
	Item i1 = new Item(1);
	Item i2 = new Item(2);
	Item i3 = new Item(3);
	Item i4 = new Item(4);
	Item i5 = new Item(5);
	Item i6 = new Item(6);
	Item i9 = new Item(9);
	Item[] its = new Item[10];

	@Before
	public void setUp() {
		i0 = new Item(0);
		i1 = new Item(1);
		i2 = new Item(2);
		i3 = new Item(3);
		i4 = new Item(4);
		i5 = new Item(5);
		i6 = new Item(6);
		i9 = new Item(9);
		its[0] = i4;
		its[1] = i2;
		its[2] = i3;
		its[3] = i1;
		its[4] = i6;
		its[5] = i6;
		its[6] = i9;
		its[7] = i0;
		its[8] = i9;
		its[9] = i5;
	}

	// covers 2.b and 2.d in test document for bubble sort
	@Test
	public void testBubNull() {
		try {
			SortAlgos.bubbleSort(null);
			fail("Should have recieved null error");
		} catch (NullPointerException e) {
			// test successful
		}
	}

	// covers 2.everything else in document for bubble sort
	@Test
	public void testBub() {

		SortAlgos.bubbleSort(its);

		assertEquals(its[0], i0);
		assertEquals(its[1], i1);
		assertEquals(its[2], i2);
		assertEquals(its[3], i3);
		assertEquals(its[4], i4);
		assertEquals(its[5], i5);
		assertEquals(its[6], i6);
		assertEquals(its[7], i6);
		assertEquals(its[8], i9);
		assertEquals(its[9], i9);
	}

	// covers 2.b and 2.d in test document for selection sort
	@Test
	public void testSelNull() {
		try {
			SortAlgos.selectionSort(null);
			fail("Should have recieved null error");
		} catch (NullPointerException e) {
			// test successful
		}
	}

	// covers 2.everything else in document for seelction sort
	@Test
	public void testSel() {

		SortAlgos.selectionSort(its);

		assertEquals(its[0], i0);
		assertEquals(its[1], i1);
		assertEquals(its[2], i2);
		assertEquals(its[3], i3);
		assertEquals(its[4], i4);
		assertEquals(its[5], i5);
		assertEquals(its[6], i6);
		assertEquals(its[7], i6);
		assertEquals(its[8], i9);
		assertEquals(its[9], i9);
	}

	// covers 2.b and 2.d in test document for insertion sort
	@Test
	public void testInsNull() {
		try {
			SortAlgos.insertionSort(null);
			fail("Should have recieved null error");
		} catch (NullPointerException e) {
			// test successful
		}
	}

	// covers 2.everything else in document for insertion sort
	@Test
	public void testIns() {

		SortAlgos.insertionSort(its);

		assertEquals(its[0], i0);
		assertEquals(its[1], i1);
		assertEquals(its[2], i2);
		assertEquals(its[3], i3);
		assertEquals(its[4], i4);
		assertEquals(its[5], i5);
		assertEquals(its[6], i6);
		assertEquals(its[7], i6);
		assertEquals(its[8], i9);
		assertEquals(its[9], i9);
	}

	// covers 2.b and 2.d in test document for merge sort
	@Test
	public void testMergeNull() {
		try {
			SortAlgos.mergeSort(null);
			fail("Should have recieved null error");
		} catch (NullPointerException e) {
			// test successful
		}
	}

	// covers 2.everything else in document for merge sort
	@Test
	public void testMerge() {

		SortAlgos.mergeSort(its);

		assertEquals(its[0], i0);
		assertEquals(its[1], i1);
		assertEquals(its[2], i2);
		assertEquals(its[3], i3);
		assertEquals(its[4], i4);
		assertEquals(its[5], i5);
		assertEquals(its[6], i6);
		assertEquals(its[7], i6);
		assertEquals(its[8], i9);
		assertEquals(its[9], i9);
	}

	// covers 2.b and 2.d in test document for quick sort
	@Test
	public void testQNull() {
		try {
			SortAlgos.quickSort(null);
			fail("Should have recieved null error");
		} catch (NullPointerException e) {
			// test successful
		}
	}

	// covers 2.everything else in document for quick sort
	@Test
	public void testQ() {

		SortAlgos.quickSort(its);

		assertEquals(its[0], i0);
		assertEquals(its[1], i1);
		assertEquals(its[2], i2);
		assertEquals(its[3], i3);
		assertEquals(its[4], i4);
		assertEquals(its[5], i5);
		assertEquals(its[6], i6);
		assertEquals(its[7], i6);
		assertEquals(its[8], i9);
		assertEquals(its[9], i9);
	}
	
	//covers 2.b and 2.d in test document for insertion sort
		@Test
		public void testHeapNull() {
			try {
				SortAlgos.heapSort(null);
				fail("Should have recieved null error");
			} catch (NullPointerException e) {
				// test successful
			}
		}

		// covers 2.everything else in document for insertion sort
		@Test
		public void testHeap() {

			SortAlgos.heapSort(its);

			assertEquals(its[0], i0);
			assertEquals(its[1], i1);
			assertEquals(its[2], i2);
			assertEquals(its[3], i3);
			assertEquals(its[4], i4);
			assertEquals(its[5], i5);
			assertEquals(its[6], i6);
			assertEquals(its[7], i6);
			assertEquals(its[8], i9);
			assertEquals(its[9], i9);
		}

}
