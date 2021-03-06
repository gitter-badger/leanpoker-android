package org.leanpoker.data;

import org.leanpoker.data.model.Address;
import org.leanpoker.data.model.Date;
import org.leanpoker.data.model.Facilitator;

/**
 * Created by tbalogh on 06/09/15.
 */
public class Event {
	private final long        mEventId;
	private final String      mName;
	private final Date        mDate;
	private final Facilitator mFacilitator;
	private final Address     mAddress;

	public Event(final long eventId, final String name, final Date date,
	             final Facilitator facilitator, final Address address) {
		mEventId = eventId;
		mName = name;
		mDate = date;
		mFacilitator = facilitator;
		mAddress = address;
	}

	public String getName() {
		return mName;
	}

	public Date getDate() {
		return mDate;
	}

	public Facilitator getFacilitator() {
		return mFacilitator;
	}

	public Address getAddress() {
		return mAddress;
	}
}
