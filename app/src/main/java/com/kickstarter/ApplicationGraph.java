package com.kickstarter;

import com.kickstarter.libs.CurrentUser;
import com.kickstarter.libs.Money;
import com.kickstarter.presenters.ActivityFeedPresenter;
import com.kickstarter.presenters.CommentFeedPresenter;
import com.kickstarter.presenters.DiscoveryFilterPresenter;
import com.kickstarter.presenters.DiscoveryPresenter;
import com.kickstarter.presenters.LoginPresenter;
import com.kickstarter.presenters.ProjectPresenter;
import com.kickstarter.presenters.ThanksPresenter;
import com.kickstarter.presenters.TwoFactorPresenter;
import com.kickstarter.ui.activities.ActivityFeedActivity;
import com.kickstarter.ui.activities.CommentFeedActivity;
import com.kickstarter.ui.activities.DiscoveryActivity;
import com.kickstarter.ui.viewholders.ProjectContextViewHolder;
import com.kickstarter.ui.viewholders.CommentViewHolder;
import com.kickstarter.ui.activities.HelpActivity;
import com.kickstarter.ui.activities.ProjectActivity;
import com.kickstarter.ui.viewholders.ProjectViewHolder;
import com.kickstarter.ui.viewholders.RewardViewHolder;
import com.kickstarter.ui.views.CommentFeedToolbar;
import com.kickstarter.ui.viewholders.ProjectCardViewHolder;
import com.kickstarter.ui.viewholders.ProjectStateChangedPositiveViewHolder;
import com.kickstarter.ui.views.DiscoveryToolbar;
import com.kickstarter.ui.views.IconTextView;
import com.kickstarter.ui.views.KickstarterWebView;
import com.kickstarter.ui.views.ProjectActionToolbar;
import com.kickstarter.ui.views.TiemposTextView;

public interface ApplicationGraph {
  void inject(ActivityFeedActivity activity);
  void inject(ActivityFeedPresenter presenter);
  void inject(CommentFeedActivity activity);
  void inject(CommentFeedPresenter presenter);
  void inject(CommentFeedToolbar toolbar);
  void inject(CommentViewHolder viewHolder);
  void inject(CurrentUser currentUser);
  void inject(DiscoveryActivity activity);
  void inject(DiscoveryToolbar toolbar);
  void inject(DiscoveryFilterPresenter presenter);
  void inject(DiscoveryPresenter presenter);
  void inject(HelpActivity activity);
  void inject(IconTextView view);
  void inject(KickstarterWebView view);
  void inject(KSApplication application);
  void inject(LoginPresenter presenter);
  void inject(Money money);
  void inject(ProjectActionToolbar toolbar);
  void inject(ProjectContextViewHolder viewHolder);
  void inject(ProjectActivity activity);
  void inject(ProjectPresenter presenter);
  void inject(ProjectCardViewHolder viewHolder);
  void inject(ProjectStateChangedPositiveViewHolder viewHolder);
  void inject(ProjectViewHolder viewHolder);
  void inject(RewardViewHolder viewHolder);
  void inject(ThanksPresenter presenter);
  void inject(TiemposTextView view);
  void inject(TwoFactorPresenter presenter);
}
