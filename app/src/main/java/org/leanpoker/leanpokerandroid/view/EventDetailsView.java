package org.leanpoker.leanpokerandroid.view;

import org.leanpoker.leanpokerandroid.model.EventDetailsModel;

/**
 * Created by tbalogh on 19/09/15.
 */
public interface EventDetailsView {
	void renderEvent(final EventDetailsModel eventDetailsModel);

	void showError(final String errorMessage);
}
